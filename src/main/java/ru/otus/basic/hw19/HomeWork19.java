package ru.otus.basic.hw19;

public class HomeWork19 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Apple> anotherAppleBox = new Box<>();
        anotherAppleBox.addFruit(new Apple());

        System.out.println("Вес коробки с яблоками: " + appleBox.weight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.weight());

        System.out.println("Коробки с яблоками и апельсинами имеют одинаковый вес? " + appleBox.compare(orangeBox));

        appleBox.transfer(anotherAppleBox);
        System.out.println("Вес коробки с яблоками после пересыпания: " + appleBox.weight());
        System.out.println("Вес другой коробки с яблоками после пересыпания: " + anotherAppleBox.weight());
    }
}