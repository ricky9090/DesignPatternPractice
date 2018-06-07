package com.pattern.singleton;

public class TypeB {

    static class SingletonHolder {
        static TypeB instance = new TypeB();
    }

    public static TypeB getInstance() {
        return SingletonHolder.instance;
    }
}
