package com.pattern.decorator;

public abstract class TeaDecorator extends Tea {

    private Tea tea;

    public TeaDecorator(Tea _tea) {
        this.tea = _tea;
    }

    public Tea getTea() {
        return tea;
    }

    @Override
    public abstract String getDescription();

}
