package org.szpax.designpatterns.level_1.factory;

public class Example {

    public static void main(String[] args) {

        ComplicatedObjectFactory complicatedObjectFactory = new ComplicatedObjectFactory(10);

        ComplicatedObject nowyObjectZSamymName = complicatedObjectFactory.create("nowyObject");
        ComplicatedObject objectWithDefaultName = complicatedObjectFactory.create("nowyObject", "z surname", 15);
        ComplicatedObject objectWithNameAndSurname = complicatedObjectFactory.createWithDefaultAge("nowy Object", "z surname i default age");

        System.out.println("Sposob pierwszy: " + nowyObjectZSamymName);
        System.out.println("Sposob drugi: " + objectWithDefaultName);
        System.out.println("Sposob trzeci: " + objectWithNameAndSurname);
    }

}
