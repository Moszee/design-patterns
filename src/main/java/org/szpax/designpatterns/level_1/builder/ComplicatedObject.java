package org.szpax.designpatterns.level_1.builder;

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

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "ComplicatedObject{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private String name;
        private String surName;
        private int age;

        //zwroc uwage na return this; - to powoduje ze mozesz zawolac .name("name").surname("surname").
        //To tak zwany fluent builder, rozszerzony pattern :)
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public ComplicatedObject build() {
            return new ComplicatedObject(name, surName, age);
        }
    }
}
