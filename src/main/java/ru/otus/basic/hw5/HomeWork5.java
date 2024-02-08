package ru.otus.basic.hw5;

public class HomeWork5 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик", 50);
        cat1.info();
        cat1.run(30);
        cat1.swim(10);

        Cat cat2 = new Cat("Барсик", 70);
        cat2.info();
        cat2.run(40);
        cat2.swim(15);

        Dog dog1 = new Dog("Шарик", 1.5, 100);
        dog1.info();
        dog1.run(80);
        dog1.swim(20);

        Dog dog2 = new Dog("Рекс", 2.0, 120);
        dog2.info();
        dog2.run(100);
        dog2.swim(30);

        Horse horse1 = new Horse("Спорт", 2, 150);
        horse1.info();
        horse1.run(150);
        horse1.swim(50);

        Horse horse2 = new Horse("Буцефал", 5.0, 250);
        horse2.info();
        horse2.run(200);
        horse2.swim(100);
    }
}