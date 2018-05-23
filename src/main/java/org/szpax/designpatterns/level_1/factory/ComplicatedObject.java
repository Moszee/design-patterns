package org.szpax.designpatterns.level_1.factory;

public class ComplicatedObject {

    private final String name;
    private final String surName;
    private final int age;

    public ComplicatedObject(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ComplicatedObject{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
