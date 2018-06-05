package com.pattern.decorator.flavor;

import com.pattern.decorator.Tea;
import com.pattern.decorator.TeaDecorator;

public class Lemon extends TeaDecorator {

    public Lemon(Tea _tea) {
        super(_tea);
    }

    @Override
    public String getDescription() {
        return getTea().getDescription() + ", Lemon";
    }

    @Override
    public double getCost() {
        addLemon();
        return getTea().getCost() + 3;
    }

    private void addLemon() {
        System.out.println("Lemon   x1  -- 3.0");
    }
}
