package com.xzit.factory;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = Factory.getFruit("orange");
        fruit.plant();
        fruit.grow();
        fruit.harvest();
    }
}
