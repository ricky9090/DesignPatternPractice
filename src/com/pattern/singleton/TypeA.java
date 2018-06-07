package com.pattern.singleton;

public class TypeA {

    private volatile static TypeA instance;

    private TypeA() {

    }

    public static TypeA getInstance() {
        if (instance == null) {
            synchronized (TypeA.class) {
                if (instance == null) {
                    instance = new TypeA();
                }
            }
        }
        return instance;
    }
}
