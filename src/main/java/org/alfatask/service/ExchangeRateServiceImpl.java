package org.alfatask.service;


import org.alfatask.model.OpenExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

    @Value("${openexchangerate.appid}")
    private String api_id;
    @Value("${openexchangerate.symbol}")
    private String symbol;

    @Autowired
    private OpenExchangeAPI openExchangeAPI;

    @Override
    public boolean checkExchangeRate() {

        OpenExchange latestExchange = openExchangeAPI.getOpenExchange(api_id);
        LocalDate today = LocalDate.now();
        String yearstoday = String.valueOf(today.minusDays(1));
        OpenExchange yerstodayExchange = openExchangeAPI.getOpenExchangeHistorical(api_id,yearstoday);


        if(latestExchange.getRates().get(symbol) > yerstodayExchange.getRates().get(symbol))

        {
            return true;
        }
       else return false;


    }
}
