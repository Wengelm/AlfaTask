package org.alfatask.controller;

import org.alfatask.model.Giphy;
import org.alfatask.model.GiphyResponse;
import org.alfatask.service.ExchangeRateService;
import org.alfatask.service.GiphyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {


    @Autowired
    private ExchangeRateService exchangeRateService;
    @Autowired
    private GiphyService giphyService;
    

    @RequestMapping("/giphy")
    public Giphy index()

    {

        boolean isExchangeRateLarger = exchangeRateService.checkExchangeRate();

        GiphyResponse ghResponse = giphyService.getGiphy(isExchangeRateLarger);



        return ghResponse.data;
    }

}