package com.pattern.singleton;

public class TestMain {

    public static void main(String[] args) {
        TypeA testA1 = TypeA.getInstance();
        TypeA testA2 = TypeA.getInstance();
        if (testA1 == testA2) {
            System.out.println("typeA singleton true");
        }

        TypeB testB1 = TypeB.getInstance();
        TypeB testB2 = TypeB.getInstance();
        if (testB1 == testB2) {
            System.out.println("typeB singleton true");
        }
    }
}
