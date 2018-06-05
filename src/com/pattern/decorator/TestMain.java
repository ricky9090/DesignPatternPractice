package com.pattern.decorator;

import com.pattern.decorator.flavor.Lemon;
import com.pattern.decorator.flavor.Milk;
import com.pattern.decorator.flavor.Sugar;
import com.pattern.decorator.product.BlackTea;
import com.pattern.decorator.product.GreenTea;

public class TestMain {

    public static void main(String[] args) {
        String msg = "Cooking BlackTea + Sugar x2 + Milk x1 + Lemon x1";
        System.out.println(msg);
        Tea blackTea = new BlackTea();
        System.out.println(blackTea.getDescription() + ", " + blackTea.getCost());
        blackTea = new Sugar(blackTea);
        blackTea = new Sugar(blackTea);
        blackTea = new Milk(blackTea);
        blackTea = new Lemon(blackTea);
        System.out.println(blackTea.getDescription() + ", Total: " + blackTea.getCost());

        System.out.println();
        String msg2 = "Cooking GreenTea + Sugar x1 + Lemon x1";
        System.out.println(msg2);
        Tea greenTea = new GreenTea();
        System.out.println(greenTea.getDescription() + ", " + greenTea.getCost());
        greenTea = new Sugar(greenTea);
        greenTea = new Lemon(greenTea);
        System.out.println(greenTea.getDescription() + ", Total: " + greenTea.getCost());
    }
}
