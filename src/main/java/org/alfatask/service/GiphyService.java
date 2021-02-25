package org.alfatask.service;

import org.alfatask.model.GiphyResponse;

public interface GiphyService {

    GiphyResponse getGiphy (boolean isCheckedExchange);
}
