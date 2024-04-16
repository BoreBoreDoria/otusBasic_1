package ru.otus.basic.hw14;

public class ArrayFillSingleThread {

    public static void main(String[] args) {
        final int size = 100_000_000;
        double[] array = new double[size];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Время выполнения в одном потоке: " + (endTime - startTime) + " мс");
    }
}