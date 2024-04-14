package ru.otus.basic.hw13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
       try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in)) {

           System.out.println("Сервер: " + in.readLine());

           String userInput = scanner.nextLine();
           out.println(userInput);

           System.out.println("Ответ сервера: " + in.readLine());
       } catch (IOException e) {
           System.out.println("Ошибка клиента: " + e.getMessage());
       }
    }
}
