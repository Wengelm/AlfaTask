package org.alfatask.model;

public class GiphyResponse {
    public Giphy data;
    public Meta meta;

    public Giphy getData() {
        return data;
    }

    public void setData(Giphy data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return "GiphyResponse{" +
                "data=" + data +
                ", meta=" + meta +
                '}';
    }
}
