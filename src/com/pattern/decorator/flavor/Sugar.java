package com.pattern.decorator.flavor;

import com.pattern.decorator.Tea;
import com.pattern.decorator.TeaDecorator;

public class Sugar extends TeaDecorator {

    public Sugar(Tea _tea) {
        super(_tea);
    }

    @Override
    public String getDescription() {
        return getTea().getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        addSugar();
        return getTea().getCost() + 2;
    }

    private void addSugar() {
        System.out.println("Sugar   x1  -- 2.0");
    }
}
