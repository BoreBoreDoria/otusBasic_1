package ru.otus.basic.hw5;

/**
 * Класс лошадь.
 */
public class Horse extends Animal {
    /**
     * Конструктор класса Horse.
     *
     * @param name            имя лошади
     * @param swimmingSpeed   скорость плавания лошади (м/с)
     * @param endurance       выносливость лошади
     */
    public Horse(String name, double swimmingSpeed, int endurance) {
        super(name, swimmingSpeed, endurance, 4);
    }
}