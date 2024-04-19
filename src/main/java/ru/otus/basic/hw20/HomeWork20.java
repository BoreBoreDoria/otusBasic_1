package ru.otus.basic.hw20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HomeWork20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path filePath;

        while (true) {
            System.out.println("Введите путь к файлу:");
            String inputPath = scanner.nextLine();
            filePath = Paths.get(inputPath);

            if (Files.exists(filePath) && !Files.isDirectory(filePath)) {
                break;
            } else {
                System.out.println("Файл не найден или указан путь к директории. Пожалуйста, попробуйте снова.");
            }
        }

        System.out.println("Введите искомую последовательность символов:");
        String searchString = scanner.nextLine();

        try {
            int count = countOccurrences(filePath.toString(), searchString);
            System.out.println("Последовательность символов \"" + searchString + "\" встречается " + count + " раз(а).");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static int countOccurrences(String filePath, String searchString) throws IOException {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int index = 0;
                while ((index = line.indexOf(searchString, index)) != -1) {
                    count++;
                    index += searchString.length();
                }
            }
        }
        return count;
    }
}