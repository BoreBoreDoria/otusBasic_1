package ru.otus.basic.hw6;

public class HomeWork6 {
    public static void main(String[] args) {
        Plate plate = new Plate(50);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурзик", 20);
        cats[1] = new Cat("Барсик", 15);
        cats[2] = new Cat("Том", 30);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Кот " + cat.getName() + " сыт: " + cat.isSatiety());
        }
    }
}