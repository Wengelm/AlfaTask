package org.alfatask;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.alfatask.model.Giphy;
import org.alfatask.model.GiphyResponse;
import org.alfatask.model.OpenExchange;
import org.alfatask.service.OpenExchangeAPI;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OpenExchangeAPITest {

    public static WireMockServer wireMockServer;

    @Autowired
    OpenExchangeAPI openExchangeAPI;



    @Test
    public void setOpenExchangeAPINotNull() {

        OpenExchange openExchange = openExchangeAPI.getOpenExchange("3abc43b598874a7abd530fa3928eb1a5");
        assertNotNull(openExchange);
        assertEquals("USD",openExchange.getBase());


    }



}
