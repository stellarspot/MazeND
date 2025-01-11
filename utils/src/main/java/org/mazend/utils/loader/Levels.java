package org.mazend.utils.loader;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Levels {

    @JsonProperty
    private Level[] levels;

    public Level[] getLevels() {
        return levels;
    }

    public void setLevels(Level[] levels) {
        this.levels = levels;
    }
}
