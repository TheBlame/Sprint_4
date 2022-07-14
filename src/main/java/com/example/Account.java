package com.example;

public class Account {

    private final String name;
    private static final int MIN_LENGTH = 3;
    private static final int MAX_LENGTH = 19;
    private static final String NAME_REGEX = "^[A-za-z]+\\s[A-za-z]+$";

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        return this.name.length() >= MIN_LENGTH && this.name.length() <= MAX_LENGTH && this.name.matches(NAME_REGEX);
    }
}
