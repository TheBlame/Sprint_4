package com.example;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом com.example.Account.
             Нужно создать экземпляр класса com.example.Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        String name = "Timothy Shalame";
        Account account = new Account(name);
        boolean isPrintable = account.checkNameToEmboss();
    }
}
