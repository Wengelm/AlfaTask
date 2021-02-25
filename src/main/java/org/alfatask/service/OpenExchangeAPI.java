package org.alfatask.service;

import org.alfatask.model.OpenExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(value = "openexchangerates", url ="${openexchangerates.uri}")
public interface OpenExchangeAPI {

    @RequestMapping(method = GET, value = "latest.json", produces={"application/json"})
    OpenExchange getOpenExchange(@RequestParam("app_id")String appId);

    @RequestMapping(method = GET, value = "historical/{date}" +".json", produces={"application/json"})
    OpenExchange getOpenExchangeHistorical(@RequestParam("app_id")String appId, @PathVariable("date") String date);
}
