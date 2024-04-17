package ru.otus.basic.hw14;

public class ArrayFillMultiThread {

    public static void main(String[] args) throws InterruptedException {
        final int size = 100_000_000;
        double[] array = new double[size];

        long startTime = System.currentTimeMillis();

        Thread[] threads = new Thread[4];
        for (int t = 0; t < 4; t++) {
            final int start = (size / 4) * t;
            final int end = (size / 4) * (t + 1);
            threads[t] = new Thread(() -> {
                for (int i = start; i < end; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            threads[t].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Время выполнения с использованием 4 потоков: " + (endTime - startTime) + " мс");
    }
}