package ru.otus.basic.hw19;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double weight() {
        double weight = 0.0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.weight() - anotherBox.weight()) < 0.0001;
    }

    public void transfer(Box<T> anotherBox) {
        if (anotherBox == this) {
            return; // Не пересыпаем фрукты в ту же самую коробку
        }
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
