package com.example.task04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
        }

        System.out.printf("%.6f", sum);
    }
}
