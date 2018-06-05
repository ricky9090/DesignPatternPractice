package com.pattern.decorator.flavor;

import com.pattern.decorator.Tea;
import com.pattern.decorator.TeaDecorator;

public class Milk extends TeaDecorator {

    public Milk(Tea _tea) {
        super(_tea);
    }

    @Override
    public String getDescription() {
        return getTea().getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        addMilk();
        return getTea().getCost() + 5;
    }

    private void addMilk() {
        System.out.println("Milk    x1  -- 5.0");
    }
}
