package org.alfatask.service;

import com.google.gson.Gson;
import org.alfatask.model.Giphy;
import org.alfatask.model.GiphyResponse;
import org.alfatask.model.OpenExchange;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(value = "giphy", url ="${giphy.uri}")
public interface GiphyAPI {

    @RequestMapping(method = GET, value = "random", produces={"application/json"})
    GiphyResponse getRandomGiphy(@RequestParam("api_key")String api_key, @RequestParam("tag") String tag, @RequestParam("rating") String rating);

}
