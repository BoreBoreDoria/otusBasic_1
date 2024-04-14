package ru.otus.basic.hw10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private final Map<String, List<String>> books;

    public PhoneBook() {
        books = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        books.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> find(String name) {
        return books.getOrDefault(name, new ArrayList<>());
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        return books.values().stream().anyMatch(numbers -> numbers.contains(phoneNumber));
    }
}

