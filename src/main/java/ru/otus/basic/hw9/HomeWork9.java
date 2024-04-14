package ru.otus.basic.hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWork9 {
    public static void main(String[] args) {
        // Пример использования метода generateRange
        List<Integer> range = generateRange(1, 10);
        System.out.println("Диапазон чисел от 1 до 10: " + range);

        // Пример использования метода sumGreaterThanFive
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = sumGreaterThanFive(numbers);
        System.out.println("Сумма чисел больше 5: " + sum);

        // Пример использования метода fillListWithNumber
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        fillListWithNumber(list, 10);
        System.out.println("Заполнение списка числом 10: " + list);

        // Пример использования метода increaseListByNumber
        List<Integer> listToIncrease = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        increaseListByNumber(listToIncrease, 5);
        System.out.println("Увеличение каждого элемента списка на 5: " + listToIncrease);

        // Пример использования метода getNames
        List<Worker> employees = Arrays.asList(
                new Worker("Иван", 30),
                new Worker("Анна", 25),
                new Worker("Сергей", 35)
        );
        List<String> names = getNames(employees);
        System.out.println("Имена сотрудников: " + names);

        // Пример использования метода getEmployeesByAge
        List<Worker> filteredEmployees = getEmployeesByAge(employees, 30);
        System.out.println("Сотрудник старше 30 лет: " + filteredEmployees);

        // Пример использования метода checkAverageAge
        boolean isAverageAgeGreater = checkAverageAge(employees, 30);
        System.out.println("Средний возраст сотрудник больше 30 лет: " + isAverageAgeGreater);

        // Пример использования метода getYoungestEmployee
        Worker youngest = getYoungestEmployee(employees);
        System.out.println("Самый молодой сотрудник: " + youngest.name + ", возраст: " + youngest.age);
    }

    public static List<Integer> generateRange(int min, int max) {
        List<Integer> range = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            range.add(i);
        }
        return range;
    }

    public static int sumGreaterThanFive(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 5) {
                sum += number;
            }
        }
        return sum;
    }

    public static void fillListWithNumber(List<Integer> list, int number) {
        Collections.fill(list, number);
    }

    public static void increaseListByNumber(List<Integer> list, int number) {
        list.replaceAll(integer -> integer + number);
    }

    public static List<String> getNames(List<Worker> employees) {
        List<String> names = new ArrayList<>();
        for (Worker employee : employees) {
            names.add(employee.name);
        }
        return names;
    }

    public static List<Worker> getEmployeesByAge(List<Worker> employees, int minAge) {
        List<Worker> result = new ArrayList<>();
        for (Worker employee : employees) {
            if (employee.age >= minAge) {
                result.add(employee);
            }
        }
        return result;
    }

    public static boolean checkAverageAge(List<Worker> employees, double minAverageAge) {
        int totalAge = 0;
        for (Worker employee : employees) {
            totalAge += employee.age;
        }
        double averageAge = (double) totalAge / employees.size();
        return averageAge > minAverageAge;
    }

    public static Worker getYoungestEmployee(List<Worker> employees) {
        Worker youngest = employees.get(0);
        for (Worker employee : employees) {
            if (employee.age < youngest.age) {
                youngest = employee;
            }
        }
        return youngest;
    }
}