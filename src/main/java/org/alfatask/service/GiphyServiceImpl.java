package org.alfatask.service;

import org.alfatask.model.Giphy;
import org.alfatask.model.GiphyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GiphyServiceImpl implements GiphyService {

    @Autowired
    private GiphyAPI giphyAPI;
    @Value("${giphy.app_id}")
    private String giphyApiId;
    @Value("${giphy.rich}")
    private String giphyRich;
    @Value("${giphy.broke}")
    private String giphyBroke;
    @Value("${giphy.rating}")
    private String giphyRating;


    @Override
    public GiphyResponse getGiphy(boolean isCheckedExchange) {

        if (isCheckedExchange) {
            GiphyResponse giphyResponse = giphyAPI.getRandomGiphy(giphyApiId,giphyRich, giphyRating);
            return giphyResponse;
        }
        else {
            GiphyResponse giphyResponse = giphyAPI.getRandomGiphy(giphyApiId,giphyBroke, giphyRating);
            return giphyResponse;
        }


    }
}
