package com.pattern.decorator.product;

import com.pattern.decorator.Tea;

public class GreenTea extends Tea {

    private String description = "GreenTea";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return 8;
    }
}
