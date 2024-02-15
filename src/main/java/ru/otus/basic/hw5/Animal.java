package ru.otus.basic.hw5;

/**
 * Класс животное.
 */
public class Animal {
    protected String name;
    protected double runningSpeed;
    protected double swimmingSpeed;
    protected int endurance;
    protected int swimmingEndurance;

    /**
     * Конструктор класса Animal.
     *
     * @param name               имя животного
     * @param swimmingSpeed      скорость плавания животного (м/с)
     * @param endurance          выносливость животного в целом
     * @param swimmingEndurance  выносливость, затрачиваемая на плавание
     */
    public Animal(String name, double swimmingSpeed, int endurance, int swimmingEndurance) {
        this.name = name;
        this.runningSpeed = 1;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
        this.swimmingEndurance = swimmingEndurance;
    }

    /**
     * Метод для бега животного.
     *
     * @param distance  расстояние для бега (метры)
     * @return время, затраченное на бег (секунды), или -1, если выносливости недостаточно
     */
    public double run(int distance) {
        if (endurance >= distance) {
            endurance -= distance;
            double time = distance / runningSpeed;
            System.out.println(name + " пробежал " + distance + " метров за " + time + " секунд");
            return time;
        } else {
            System.out.println(name + " устал и не может пробежать " + distance + " метров");
            return -1;
        }
    }

    /**
     * Метод для плавания животного.
     *
     * @param distance  расстояние для плавания (метры)
     * @return время, затраченное на плавание (секунды), или -1, если выносливости недостаточно
     */
    public double swim(int distance) {
        int requiredEndurance = distance * swimmingEndurance;
        if (endurance >= requiredEndurance) {
            endurance -= requiredEndurance;
            double time = distance / swimmingSpeed;
            System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд");
            return time;
        } else {
            System.out.println(name + " устал и не может проплыть " + distance + " метров");
            return -1;
        }
    }
    /**
     * Метод для вывода информации о животном.
     */
    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runningSpeed + " м/с");
        System.out.println("Скорость плавания: " + swimmingSpeed + " м/с");
        System.out.println("Выносливость: " + endurance);
    }
}