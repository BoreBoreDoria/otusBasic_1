package ru.otus.basic.hw11;

public class SortUtils {

    /**
     * Сортирует массив целых чисел методом пузырька
     * Метод проходит через массив, последовательно сравнивая пары соседних элементов
     * и меняя их местами, если они находятся в неправильном порядке
     *
     * @param array Массив целых чисел для сортировки
     */
    public static void bubbleSort(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    /**
     * Сортирует массив целых чисел методом быстрой сортировки
     *
     * @param array Массив целых чисел для сортировки
     */
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Рекурсивный метод для быстрой сортировки
     *
     * @param array Массив целых чисел для сортировки
     * @param from Начальный индекс подмассива для сортировки
     * @param to Конечный индекс подмассива для сортировки
     */
    private static void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int divideIndex = partition(array, from, to);
            quickSort(array, from, divideIndex - 1);
            quickSort(array, divideIndex, to);
        }
    }

    /**
     * Разделяет подмассив на две части от опорного элемента
     *
     * @param array Массив целых чисел для сортировки
     * @param from Начальный индекс подмассива для разделения
     * @param to Конечный индекс подмассива для разделения
     * @return Индекс, по которому подмассив был разделен
     */
    private static int partition(int[] array, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = array[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }
            while (array[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(array, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    /**
     * Обменивает местами два элемента в массиве
     *
     * @param array Массив целых чисел
     * @param index1 Индекс первого элемента для обмена
     * @param index2 Индекс второго элемента для обмена
     */
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}