package ru.otus.basic.hw22;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(Lifecycle.PER_CLASS)
public class HomeWork22Test {

    @Test
    public void testElementsAfterLastOneWhenArrayContains() {
        int[] inputArray = {0, 3, 1, 4, 5};
        int[] expectedArray = {4, 5};

        int[] actualArray = HomeWork22.elementsAfterLastOne(inputArray);

        assertArrayEquals(expectedArray, actualArray, "Метод должен возвращать элементы после последней единицы в массиве.");
    }

    @Test
    public void testElementsAfterLastOneWhenArrayDoesNotContain() {
        int[] inputArray = {0, 3, 4, 5};

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            HomeWork22.elementsAfterLastOne(inputArray);
        }, "Метод должен выбрасывать RuntimeException, если в массиве нет единицы.");
        assertTrue(exception.getMessage().contains("Входной массив не содержит единицы"), "Сообщение об исключении должно указывать, что в массиве нет единицы.");
    }

    @Test
    public void testCheckArrayContentWhenArrayContainsOnly() {
        int[] inputArray = {1, 2, 1, 2};

        boolean result = HomeWork22.checkArrayContent(inputArray);

        assertTrue(result, "Метод должен возвращать true, когда массив содержит только единицы и двойки.");
    }

    @Test
    public void testCheckArrayContentWhenArrayContainsOtherNumbers() {
        int[] inputArray = {1, 2, 3, 4};

        boolean result = HomeWork22.checkArrayContent(inputArray);

        assertFalse(result, "Метод должен возвращать false, когда массив содержит числа, отличные от 1 и 2.");
    }

    @Test
    public void testCheckArrayContentWhenArrayContainsOnlyOnesOrOnlyTwos() {
        int[] inputArrayOnlyOnes = {1, 1, 1};
        int[] inputArrayOnlyTwos = {2, 2, 2};

        boolean resultOnlyOnes = HomeWork22.checkArrayContent(inputArrayOnlyOnes);
        boolean resultOnlyTwos = HomeWork22.checkArrayContent(inputArrayOnlyTwos);

        assertFalse(resultOnlyOnes, "Метод должен возвращать false, когда массив содержит только единицы.");
        assertFalse(resultOnlyTwos, "Метод должен возвращать false, когда массив содержит только двойки.");
    }
}