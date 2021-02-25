package org.alfatask.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Images {
    @JsonProperty("fixed_height")
    private FixedImage fixedHeight;

    public Images() {
    }

    public Images(FixedImage fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public FixedImage getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(FixedImage fixedHeight) {
        this.fixedHeight = fixedHeight;
    }
}
