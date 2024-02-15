package ru.otus.basic.hw6;

/**
 * Класс, представляющий тарелку с едой.
 */
public class Plate {

    /**
     * Максимальное количество еды
     */
    private final int maxFood;

    /**
     * Текущее количество еды
     */
    private int currentFood;

    /**
     * Создает тарелку с указанным объемом и полностью заполняет ее едой.
     *
     * @param maxFood максимальное количество еды
     */
    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    /**
     * Добавляет указанное количество еды в тарелку.
     *
     * @param foodToAdd количество еды для добавления
     */
    public void addFood(int foodToAdd) {
        currentFood = Math.min(currentFood + foodToAdd, maxFood);
    }

    /**
     * Уменьшает количество еды в тарелке на указанное значение.
     *
     * @param foodToDecrease количество еды для уменьшения
     * @return true, если удалось уменьшить еду так, чтобы в тарелке осталось >= 0 кусков еды, иначе false
     */
    public boolean decreaseFood(int foodToDecrease) {
        if (currentFood >= foodToDecrease) {
            currentFood -= foodToDecrease;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Возвращает текущее количество еды в тарелке.
     *
     * @return текущее количество еды
     */
    public int getCurrentFood() {
        return currentFood;
    }
}
