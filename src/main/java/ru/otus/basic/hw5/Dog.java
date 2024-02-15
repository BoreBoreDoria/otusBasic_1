package ru.otus.basic.hw5;

/**
 * Класс собаку.
 */
public class Dog extends Animal {
    /**
     * Конструктор класса Dog.
     *
     * @param name            имя собаки
     * @param swimmingSpeed   скорость плавания собаки (м/с)
     * @param endurance       выносливость собаки
     */
    public Dog(String name, double swimmingSpeed, int endurance) {
        super(name, swimmingSpeed, endurance, 2);
    }
}
