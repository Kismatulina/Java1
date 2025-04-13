package task2_1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите исходную строку");
        String s = scanner.nextLine();

        if (s.length() == 0) {
            throw new Exception("Введена пустая строка");
        }

        StringBuilder sb = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        sb.append(currentChar).append(count);  // добавляем последний символ

        logger.info("Сжатая строка: " + sb.toString());
    }
}