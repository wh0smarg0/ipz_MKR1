package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ваше повідомлення:");
        String inputMessage = scanner.nextLine();

        // Створюємо просте повідомлення
        message message = new SimpleMessage(inputMessage);
        System.out.println("Базове повідомлення: " + message.getContent());

        // Застосовуємо шифрування
        message = new EncryptionDecorator(message);
        System.out.println("Після шифрування: " + message.getContent());

        // Застосовуємо стиснення
        message = new CompressionDecorator(message);
        System.out.println("Після стиснення: " + message.getContent());

        // Додаємо дату та час
        message = new TimeDecorator(message);
        System.out.println("Після додавання дати і часу: " + message.getContent());

        // Додаємо ПІБ автора
        message = new AuthorDecorator(message);
        System.out.println("Після додавання ПІБ автора: " + message.getContent());
    }
}