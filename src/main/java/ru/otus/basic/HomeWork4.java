package ru.otus.basic;

import ru.otus.basic.hw4.Box;
import ru.otus.basic.hw4.User;

public class HomeWork4 {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Иванов", "Иван", "Иванович", 1975, "ivanov@example.com");
        users[1] = new User("Петров", "Петр", "Петрович", 1980, "petrov@example.com");
        users[2] = new User("Сидоров", "Сидор", "Сидорович", 1970, "sidorov@example.com");
        users[3] = new User("Смирнов", "Сергей", "Александрович", 1965, "smirnov@example.com");
        users[4] = new User("Козлов", "Алексей", "Петрович", 1985, "kozlov@example.com");
        users[5] = new User("Васильев", "Дмитрий", "Иванович", 1978, "vasiliev@example.com");
        users[6] = new User("Морозов", "Андрей", "Сергеевич", 1972, "morozov@example.com");
        users[7] = new User("Новиков", "Александр", "Александрович", 1968, "novikov@example.com");
        users[8] = new User("Ковалев", "Михаил", "Дмитриевич", 1973, "kovalev@example.com");
        users[9] = new User("Зайцев", "Владимир", "Андреевич", 1982, "zaytsev@example.com");

        for (User user : users) {
            if (user.getBirthYear() > 1980) {
                user.printUserInfo();
                System.out.println();
            }
        }

        Box box = new Box(10, 10, 10, "красный");
        box.printBoxInfo();

        box.openBox();
        box.addItem("Ключ");
        box.printBoxInfo();

        box.closeBox();
        box.addItem("Монета");
        box.printBoxInfo();

        box.openBox();
        box.removeItem();
        box.printBoxInfo();

        box.openBox();
        box.removeItem();
        box.printBoxInfo();

        box.repaintBox("зелёный");
        box.printBoxInfo();
    }
}