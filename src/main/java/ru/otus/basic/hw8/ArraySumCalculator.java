package ru.otus.basic.hw8;

import ru.otus.basic.hw8.exception.AppArrayDataException;
import ru.otus.basic.hw8.exception.AppArraySizeException;

public class ArraySumCalculator {
    public static int calculateSum(String[][] array) throws AppArraySizeException, AppArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new AppArraySizeException("Массив должен быть размером 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
