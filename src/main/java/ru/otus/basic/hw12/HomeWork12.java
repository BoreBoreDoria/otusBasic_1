package ru.otus.basic.hw12;

public class HomeWork12 {
    public static void main(String[] args) {
        TextFileHandler handler = new TextFileHandler();

        handler.listTextFiles();
        String fileName = handler.askFileName();
        handler.printFileContent(fileName);
        handler.writeUserInputToFile(fileName);
    }
}