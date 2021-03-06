package org.alfatask.controller;

import org.alfatask.model.Giphy;
import org.alfatask.model.GiphyResponse;
import org.alfatask.service.ExchangeRateService;
import org.alfatask.service.GiphyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @Autowired
    private ExchangeRateService exchangeRateService;
    @Autowired
    private GiphyService giphyService;


    @RequestMapping("/")
    public String index(Model model)

    {

        boolean isExchangeRateLarger = exchangeRateService.checkExchangeRate();

        GiphyResponse ghResponse = giphyService.getGiphy(isExchangeRateLarger);

        model.addAttribute("giphy",ghResponse.data.getImages().getFixedHeight().getUrl());


        return "index";
    }
}
