package ru.otus.basic.hw22;

import java.util.Arrays;

public class HomeWork22 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(elementsAfterLastOne(new int[]{1, 2, 1, 2, 2})));
        System.out.println(checkArrayContent(new int[]{1, 2, 2, 1}));
    }

    public static int[] elementsAfterLastOne(int[] array) {
        int lastOneIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                lastOneIndex = i;
            }
        }
        if (lastOneIndex == -1) {
            throw new RuntimeException("Входной массив не содержит единицы");        }
        return Arrays.copyOfRange(array, lastOneIndex + 1, array.length);
    }

    public static boolean checkArrayContent(int[] array) {
        boolean foundOne = false;
        boolean foundTwo = false;
        for (int value : array) {
            if (value != 1 && value != 2) {
                return false;
            }
            if (value == 1) {
                foundOne = true;
            } else if (value == 2) {
                foundTwo = true;
            }
        }
        return foundOne && foundTwo;
    }
}