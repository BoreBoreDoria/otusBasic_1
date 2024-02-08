package ru.otus.basic.hw5;

/**
 * Класс кота.
 */
public class Cat extends Animal {
    /**
     * Конструктор класса Cat.
     *
     * @param name           имя кота
     * @param endurance      выносливость кота
     */
    public Cat(String name , int endurance) {
        super(name, 0, endurance, 0);
    }

    @Override
    public double swim(int distance) {
        System.out.println("Кошка не умеет плавать");
        return 0;
    }
}
