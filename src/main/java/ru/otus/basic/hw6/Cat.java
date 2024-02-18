package ru.otus.basic.hw6;

/**
 * Класс, представляющий кота.
 */
public class Cat {

    /**
     * имя кота
     */
    private final String name;

    /**
     * аппетит кота
     */
    private final int appetite;

    /**
     * сытость кота
     */
    private boolean satiety;

    /**
     * Создает кота с указанным именем и аппетитом.
     * При создании кот голоден (сытость = false).
     *
     * @param name     имя кота
     * @param appetite аппетит кота
     */
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    /**
     * Пытается покушать из указанной тарелки.
     * Если в тарелке достаточно еды, кот насыщается (сытость = true),
     * и количество еды в тарелке уменьшается на его аппетит.
     *
     * @param plate тарелка с едой
     */
    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            satiety = true;
        }
    }

    /**
     * Возвращает информацию о сытости кота.
     *
     * @return true, если кот сыт, иначе false
     */
    public boolean isSatiety() {
        return satiety;
    }

    /**
     * Метод для получения имени кота
     */
    public String getName() {
        return name;
    }
}
