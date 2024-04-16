package ru.otus.basic.hw11;

public class Person {
    private final Long id;
    private final Position position;
    private final String name;

    public Person(Long id, String name, Position position) {
        this.id = id;
        this.position = position;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
