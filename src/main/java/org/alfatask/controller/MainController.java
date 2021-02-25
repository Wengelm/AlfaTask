package org.alfatask.controller;

import com.google.gson.Gson;
import org.alfatask.model.Giphy;
import org.alfatask.model.GiphyResponse;
import org.alfatask.service.ExchangeRateService;
import org.alfatask.service.GiphyAPI;
import org.alfatask.service.GiphyService;
import org.alfatask.service.OpenExchangeAPI;
import org.alfatask.model.OpenExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @Autowired
    private ExchangeRateService exchangeRateService;
    @Autowired
    private GiphyService giphyService;
    

    @RequestMapping("/")
    public Giphy index()

    {

        boolean isExchangeRateLarger = exchangeRateService.checkExchangeRate();

        GiphyResponse ghResponse = giphyService.getGiphy(isExchangeRateLarger);



        return ghResponse.data;
    }

}