package com.pattern.decorator;

public abstract class Tea {

    private String description = "Tea";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
