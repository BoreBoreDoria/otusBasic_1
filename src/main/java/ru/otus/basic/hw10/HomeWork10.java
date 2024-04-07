package ru.otus.basic.hw10;

import java.util.List;

public class HomeWork10 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавление записей
        phoneBook.add("Иванов Иван", "123456789");
        phoneBook.add("Иванов Иван", "987654321");
        phoneBook.add("Петров Петр", "111222333");

        // Поиск номеров по имени
        List<String> ivanovNumbers = phoneBook.find("Иванов Иван");
        System.out.println("Номера Иванова Ивана: " + ivanovNumbers);

        // Проверка наличия номера в справочнике
        boolean contains = phoneBook.containsPhoneNumber("111222333");
        System.out.println("Справочник содержит номер 111222333: " + contains);
    }
}