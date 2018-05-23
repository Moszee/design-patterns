package org.szpax.designpatterns.level_1.builder;

public class Example {

    public static void main(String[] args) {
        fullObject();
        partialObject();
    }

    private static void partialObject() {
        //Czasem zdaza sie ze na duzym obiekcie wypelniamy tylko 1 pole:
        ComplicatedObject partiallyCreatedWithConstructor =
                new ComplicatedObject(null, "surname", 0);

        System.out.print("Creating partial object with constructor is a little bit worse: " + partiallyCreatedWithConstructor);


        //Za pomoca buildera mozna zrobic to fajniej, bez zadnych nulli i wymuszonych wartosci:
        ComplicatedObject partiallyCreatedWithBuilder = ComplicatedObject.builder()
                .surname("surname")
                .build();
        System.out.print("Creating partial object with builder is considered to be more readeable: " + partiallyCreatedWithBuilder);

        //Wyobraz sobie ze masz 10 pol, i chcesz stworzyc obiekt z wypelnionym 1 polem. Za pomoca konstruktora musisz wstawic tam z 9 nulli i tylko jednego stringa! A konstrukcja obiektu za pomoca buildera wyglada dokladnie jak wyzej, nic sie nie zmienia :)
    }

    private static void fullObject() {
        //przyklady uzycia buildera
        ComplicatedObject.Builder builder = new ComplicatedObject.Builder();

        builder.name("name")
                .age(10)
                .surname("SurName");

        ComplicatedObject complicatedObjectFromBuilder = builder.build();

        System.out.print("I've created new object with builder: " + complicatedObjectFromBuilder);

        //to samo konstruktorem
        ComplicatedObject complicatedObjectConstructor =
                new ComplicatedObject("name", "surname", 19);

        System.out.print("Creating full object with constructor is not that bad" + complicatedObjectConstructor);
    }

}
