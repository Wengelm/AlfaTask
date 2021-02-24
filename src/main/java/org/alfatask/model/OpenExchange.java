package org.alfatask.model;

import java.util.HashMap;

public class OpenExchange {

     private String disclaimer;
     private String license;
     private Long timestamp;
     private String base;
     private HashMap<String, Float> rates;

    public OpenExchange() {
    }

    public OpenExchange(String disclaimer, String license, Long timestamp, String base, HashMap<String, Float> rates) {
        this.disclaimer = disclaimer;
        this.license = license;
        this.timestamp = timestamp;
        this.base = base;
        this.rates = rates;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public HashMap<String, Float> getRates() {
        return rates;
    }

    public void setRates(HashMap<String, Float> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "OpenExchange{" +
                "disclaimer='" + disclaimer + '\'' +
                ", license='" + license + '\'' +
                ", timestamo=" + timestamp +
                ", base='" + base + '\'' +
                ", rates=" + rates +
                '}';
    }
}
