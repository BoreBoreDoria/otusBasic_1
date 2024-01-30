package ru.otus.basic;

public class HomeWork3 {
    public static void main(String[] args) {
        int[][] array = {{1, -2, 3}, {-4, 5, -6}, {7, -8, 9}};

        // Проверка метода sumOfPositiveElements
        int sum = sumOfPositiveElements(array);
        System.out.println("Сумма положительных элементов массива: " + sum);

        // Проверка метода printSquare
        int size = 5;
        printSquare(size);

        // Проверка метода zeroOutDiagonal
        zeroOutDiagonal(array);
        System.out.println("Массив после зануления диагональных элементов:");
        printArray(array);

        // Проверка метода findMax
        int max = findMax(array);
        System.out.println("Максимальный элемент массива: " + max);

        // Проверка метода sumOfSecondRowOrColumn
        int sumSecondRowOrColumn = sumOfSecondRowOrColumn(array);
        if (sumSecondRowOrColumn != -1) {
            System.out.println("Сумма элементов второй строки или столбца массива: " + sumSecondRowOrColumn);
        } else {
            System.out.println("Вторая строка или столбец массива не существует.");
        }
    }

    /**
     * Метод для подсчета суммы всех положительных элементов в двумерном массиве.
     *
     * @param array Двумерный массив целых чисел.
     * @return Сумма положительных элементов массива.
     */
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int num : row) {
                if (num > 0) {
                    sum += num;
                }
            }
        }
        return sum;
    }

    /**
     * Метод для печати квадрата из символов '*' со сторонами заданной длины.
     *
     * @param size Длина стороны квадрата.
     */
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Метод для зануления диагональных элементов квадратного двумерного массива.
     *
     * @param array Квадратный двумерный массив целых чисел.
     */
    public static void zeroOutDiagonal(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i][i] = 0;
        }
    }

    /**
     * Метод для поиска максимального элемента в двумерном массиве.
     *
     * @param array Двумерный массив целых чисел.
     * @return Максимальный элемент массива.
     */
    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    /**
     * Метод для подсчета суммы элементов второй строки или столбца двумерного массива.
     * Если второй строки/столбца не существует, возвращает -1.
     *
     * @param array Двумерный массив целых чисел.
     * @return Сумма элементов второй строки или столбца массива, или -1, если второй строки/столбца не существует.
     */
    public static int sumOfSecondRowOrColumn(int[][] array) {
        int sum = 0;
        if (array.length >= 2) {
            int[] secondRow = array[1];
            for (int num : secondRow) {
                sum += num;
            }
        } else {
            return -1;
        }
        return sum;
    }

    /**
     * Метод для печати двумерного массива.
     *
     * @param array Двумерный массив целых чисел.
     */
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}