package org.szpax.designpatterns.level_1.factory;

//Dzieki fabryce (faktory) mozemy logike tworzenia obiektow wyciagnac POZA sam obiekt. Tutaj np. mamy 3 mozliwosci utworzenia nowego obiektu
public class ComplicatedObjectFactory {

    private final int defaultAge;

    public ComplicatedObjectFactory(int defaultAge) {
        this.defaultAge = defaultAge;
    }


    //1. Podajac wszystkie dane
    public ComplicatedObject create(String name, String surName, int age) {
        return new ComplicatedObject(name, surName, age);
    }

    //2. Podajac dane ktore nie maja wartosci domyslnej
    public ComplicatedObject createWithDefaultAge(String name, String surName) {
        return new ComplicatedObject(name, surName, defaultAge);
    }

    //3. Podajac tylko konieczne dane
    public ComplicatedObject create(String name) {
        return new ComplicatedObject(name, null, defaultAge);
    }
}
