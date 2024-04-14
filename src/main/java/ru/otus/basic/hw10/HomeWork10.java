package ru.otus.basic.hw10;

import java.util.List;

public class HomeWork10 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов Иван", "123456789");
        phoneBook.add("Иванов Иван", "987654321");
        phoneBook.add("Петров Петр", "111222333");

        List<String> ivanovNumbers = phoneBook.find("Иванов Иван");
        System.out.println("Номера Иванова Ивана: " + ivanovNumbers);

        boolean contains = phoneBook.containsPhoneNumber("111222333");
        System.out.println("Справочник содержит номер 111222333: " + contains);
    }
}