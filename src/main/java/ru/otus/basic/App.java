package ru.otus.basic;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 5: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                greetings(); // Вызов метода greetings()
                break;
            case 2:
                checkSign(5, -10, 15); // Вызов метода checkSign() с аргументами 5, -10, 15
                break;
            case 3:
                selectColor(); // Вызов метода selectColor()
                break;
            case 4:
                compareNumbers(); // Вызов метода compareNumbers()
                break;
            case 5:
                addOrSubtractAndPrint(10, 5, true); // Вызов метода addOrSubtractAndPrint() с аргументами 10, 5, true
                break;
            default:
                System.out.println("Неверный выбор!");
        }
    }

    // Метод для печати приветствия
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    // Метод для проверки знака суммы трех чисел
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Метод для выбора цвета на основе случайного числа
    public static void selectColor() {
        int data = new Random().nextInt(30);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Метод для сравнения двух чисел
    public static void compareNumbers() {
        int a = 10;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Метод для сложения или вычитания двух чисел и печати результата
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment) {
            result = initValue + delta;
        } else {
            result = initValue - delta;
        }
        System.out.println("Результат: " + result);
    }
}