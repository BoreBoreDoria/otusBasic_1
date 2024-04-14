package ru.otus.basic.hw8;

import ru.otus.basic.hw8.exception.AppArrayDataException;
import ru.otus.basic.hw8.exception.AppArraySizeException;

public class HomeWork8 {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = ArraySumCalculator.calculateSum(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (AppArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (AppArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }
    }
}