package org.alfatask;

import org.alfatask.model.OpenExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(value = "open", url ="${openexchangerates.uri}")
public interface OpenExchangeService {

    @RequestMapping(method = GET, value = "latest.json", produces={"application/json"})
    @ResponseBody
    OpenExchange getOpenExchange(@RequestParam("app_id")String appId);

    @RequestMapping(method = GET, value = "latest.json", produces={"application/json"})
    @ResponseBody
    OpenExchange getOpenExchangeHistorical(@RequestParam("app_id")String appId,@RequestParam("base") String base);
}
