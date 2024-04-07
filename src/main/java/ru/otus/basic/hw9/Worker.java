package ru.otus.basic.hw9;

public class Worker {
    String name;
    int age;

    Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "имя='" + name + '\'' +
                ", возраст=" + age +
                '}';
    }
}
