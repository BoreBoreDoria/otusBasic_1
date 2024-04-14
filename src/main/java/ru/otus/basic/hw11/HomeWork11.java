package ru.otus.basic.hw11;

public class HomeWork11 {
    public static void main(String[] args) {
        PersonDataBase personDataBase = new PersonDataBase();

        personDataBase.add(new Person(1L, "Manager 1", Position.MANAGER));
        personDataBase.add(new Person(2L, "Director 1", Position.DIRECTOR));
        personDataBase.add(new Person(3L, "Employee 1", Position.ANOTHER_MANAGER));

        System.out.println("Поиск Person с ID 1: " + personDataBase.findById(1L));
        System.out.println("Поиск Person с ID 2: " + personDataBase.findById(2L));
        System.out.println("Поиск Person с ID 3: " + personDataBase.findById(3L));

        System.out.println("Person с ID 1 является менеджером: " + personDataBase.isManager(personDataBase.findById(1L)));
        System.out.println("Person с ID 2 является менеджером: " + personDataBase.isManager(personDataBase.findById(2L)));
        System.out.println("Person с ID 3 является менеджером: " + personDataBase.isManager(personDataBase.findById(3L)));

        System.out.println("Person с ID 1 является сотрудником: " + personDataBase.isEmployee(1L));
        System.out.println("Person с ID 2 является сотрудником: " + personDataBase.isEmployee(2L));
        System.out.println("Person с ID 3 является сотрудником: " + personDataBase.isEmployee(3L));

        int[] arrayToBubbleSort = {5, 1, 4, 2, 8};
        int[] arrayToQuickSort = {10, 7, 8, 9, 1, 5};

        SortUtils.bubbleSort(arrayToBubbleSort);
        SortUtils.quickSort(arrayToQuickSort);

        System.out.println("Отсортированный массив методом пузырька: ");
        for (int value : arrayToBubbleSort) {
            System.out.print(value + " ");
        }

        System.out.println("\nОтсортированный массив быстрой сортировкой: ");
        for (int value : arrayToQuickSort) {
            System.out.print(value + " ");
        }
    }
}