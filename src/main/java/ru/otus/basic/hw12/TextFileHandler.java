package ru.otus.basic.hw12;

import java.io.*;
import java.util.Scanner;


public class TextFileHandler {

    private final Scanner scanner;

    public TextFileHandler() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Выводит список текстовых файлов в корневом каталоге проекта.
     */
    public void listTextFiles() {
        File rootDir = new File(".");
        FilenameFilter textFilter = (dir, name) -> name.endsWith(".txt");
        File[] files = rootDir.listFiles(textFilter);

        System.out.println("Список текстовых файлов в корневом каталоге:");
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    /**
     * Запрашивает у пользователя имя файла для работы и возвращает его.
     *
     * @return Имя файла, выбранного пользователем.
     */
    public String askFileName() {
        System.out.println("Введите имя файла для работы:");
        return scanner.nextLine();
    }

    /**
     * Выводит содержимое указанного файла в консоль.
     *
     * @param fileName Имя файла для чтения.
     */
    public void printFileContent(String fileName) {
        File file = new File(fileName);
        if (file.exists() && file.isFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Ошибка при чтении файла: " + e.getMessage());
            }
        } else {
            System.out.println("Файл не найден.");
        }
    }

    /**
     * Записывает строку, введенную пользователем, в указанный файл.
     *
     * @param fileName Имя файла для записи.
     */
    public void writeUserInputToFile(String fileName) {
        System.out.println("Введите строку для записи в файл:");
        String userText = scanner.nextLine();
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(userText + "\n");
            System.out.println("Строка успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}