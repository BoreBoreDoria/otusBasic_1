package ru.otus.basic.hw21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HomeWork21 {
    private static final Lock lock = new ReentrantLock();
    private static final Condition conditionA = lock.newCondition();
    private static final Condition conditionB = lock.newCondition();
    private static final Condition conditionC = lock.newCondition();
    private static char currentLetter = 'A';

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    lock.lock();
                    try {
                        while (currentLetter != 'A') {
                            conditionA.await();
                        }
                        System.out.print("A");
                        currentLetter = 'B';
                        conditionB.signal();
                    } finally {
                        lock.unlock();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    lock.lock();
                    try {
                        while (currentLetter != 'B') {
                            conditionB.await();
                        }
                        System.out.print("B");
                        currentLetter = 'C';
                        conditionC.signal();
                    } finally {
                        lock.unlock();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    lock.lock();
                    try {
                        while (currentLetter != 'C') {
                            conditionC.await();
                        }
                        System.out.print("C");
                        currentLetter = 'A';
                        conditionA.signal();
                    } finally {
                        lock.unlock();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
    }
}