package com.pattern.decorator.product;

import com.pattern.decorator.Tea;

public class BlackTea extends Tea {

    private String description = "BlackTea";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return 10;
    }
}
