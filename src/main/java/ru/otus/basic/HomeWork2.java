package ru.otus.basic;

public class HomeWork2 {
    public static void main(String[] args) {
        // Метод для печати строки указанное количество раз
        printStringMultipleTimes(3, "Привет");

        // Метод для суммирования элементов массива, значение которых больше 5, и печати суммы
        int[] array = {1, 6, 2, 8, 4, 3};
        sumElementsGreaterThanFive(array);

        // Метод для заполнения каждой ячейки массива указанным числом
        int[] numbers = new int[5];
        fillArrayWithNumber(numbers, 10);

        // Метод для увеличения каждого элемента массива на указанное число
        int[] values = {2, 4, 6, 8, 10};
        increaseArrayElements(values, 5);

        // Метод для определения, сумма элементов какой половины массива больше
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printSumOfLargerHalf(nums);
    }

    // Метод для печати строки указанное количество раз
    public static void printStringMultipleTimes(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // Метод для суммирования элементов массива, значение которых больше 5, и печати суммы
    public static void sumElementsGreaterThanFive(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println("Сумма элементов больше 5: " + sum);
    }

    // Метод для заполнения каждой ячейки массива указанным числом
    public static void fillArrayWithNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

    // Метод для увеличения каждого элемента массива на указанное число
    public static void increaseArrayElements(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
    }

    // Метод для определения, сумма элементов какой половины массива больше
    public static void printSumOfLargerHalf(int[] array) {
        int middle = array.length / 2;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < middle; i++) {
            sumFirstHalf += array[i];
        }

        for (int i = middle; i < array.length; i++) {
            sumSecondHalf += array[i];
        }

        if (sumFirstHalf > sumSecondHalf) {
            System.out.println("Сумма элементов первой половины больше");
        } else if (sumFirstHalf < sumSecondHalf) {
            System.out.println("Сумма элементов второй половины больше");
        } else {
            System.out.println("Сумма элементов первой и второй половин равны");
        }
    }
}