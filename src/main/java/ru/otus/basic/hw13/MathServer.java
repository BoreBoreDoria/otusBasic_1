package ru.otus.basic.hw13;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MathServer {
    private static final int PORT = 12345;

    public static void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Сервер запущен и ожидает подключений...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

                    System.out.println("Клиент подключен: " + clientSocket.getInetAddress());

                    out.println("Доступные операции: +, -, *, /");

                    String inputLine = in.readLine();
                    if (inputLine != null) {
                        System.out.println("Получен запрос: " + inputLine);
                        String response = processRequest(inputLine);
                        System.out.println("Сформирован ответ: " + response);
                        out.println(response);
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка при работе с клиентом: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Не удается запустить сервер: " + e.getMessage());
        }
    }

    private static String processRequest(String request) {
        String[] parts = request.split(" ");
        if (parts.length != 3) {
            return "Ошибка: неверный формат запроса. Используйте формат '<число1> <операция> <число2>'.";
        }

        double operand1, operand2;
        String operation = parts[1];

        try {
            operand1 = Double.parseDouble(parts[0]);
            operand2 = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            return "Ошибка: один из операндов не является числом.";
        }

        switch (operation) {
            case "+":
                return "Результат: " + (operand1 + operand2);
            case "-":
                return "Результат: " + (operand1 - operand2);
            case "*":
                return "Результат: " + (operand1 * operand2);
            case "/":
                if (operand2 == 0) {
                    return "Ошибка: деление на ноль.";
                }
                return "Результат: " + (operand1 / operand2);
            default:
                return "Ошибка: неизвестная операция '" + operation + "'. Доступные операции: +, -, *, /.";
        }
    }
}