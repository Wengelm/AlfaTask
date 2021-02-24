package org.alfatask.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.alfatask.OpenExchangeService;
import org.alfatask.model.OpenExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private OpenExchangeService openExchangeService;

    @RequestMapping("/")
    public OpenExchange index(@RequestParam(required = true) String test)

    {
        OpenExchange openExchange = openExchangeService.getOpenExchange(test);
        System.out.println(openExchange);
        return openExchange;
    }

}