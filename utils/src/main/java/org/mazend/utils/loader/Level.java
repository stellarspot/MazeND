package org.mazend.utils.loader;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Level {

    @JsonProperty
    private String name;

    @JsonProperty
    private int dimension;

    @Override
    public String toString() {
        return String.format("name: %s, dimension: %d", name, dimension);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
