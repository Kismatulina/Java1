package Java.java_sem5.homework5;
/**Урок 10. Семинар 5: Хранение и обработка данных ч2: множество коллекций Map
 ДЗ 
📌 Реализуйте структуру телефонной книги с помощью HashMap
📌 Программа также должна учитывать, что в во входной структуре будут
повторяющиеся имена с разными телефонами, их необходимо считать, как одного
человека с разными телефонами. Вывод должен быть отсортирован по убыванию
числа телефонов. */
/**
код, который включает:
1. Сохранение данных в файл (phonebook.txt)
2. Чтение данных из файла при старте
3. Поддержку русского языка
4. Улучшенный интерфейс пользователя
*/

import java.io.*;
import java.util.*;

public class Book {
    private static final String FILE_NAME = "phonebook.txt"; //static final странно

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        Map<String, Set<String>> phoneBook = loadPhoneBook();

        System.out.println("Телефонная книга");
        System.out.println("Доступные команды:");
        System.out.println("- добавить контакт: Имя Телефон");
        System.out.println("- просмотреть все контакты: view");
        System.out.println("- удалить контакт: delete Имя");
        System.out.println("- завершить работу: exit");

        while (true) {
            System.out.print("\nВведите команду: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                savePhoneBook(phoneBook);
                System.out.println("Данные сохранены. Выход из программы.");
                break;
            } else if (input.equalsIgnoreCase("view")) {
                if (phoneBook.isEmpty()) {
                    System.out.println("Телефонная книга пуста.");
                } else {
                    printSortedPhoneBook(phoneBook);
                }
            } else if (input.toLowerCase().startsWith("delete ")) {
                String nameToDelete = input.substring(7).trim();
                if (phoneBook.containsKey(nameToDelete)) {
                    phoneBook.remove(nameToDelete);
                    System.out.println("Контакт '" + nameToDelete + "' удален.");
                } else {
                    System.out.println("Контакт '" + nameToDelete + "' не найден.");
                }
            } else {
                String[] parts = input.split("\\s+", 2);
                if (parts.length != 2) {
                    System.out.println("Ошибка: Неверный формат ввода. Используйте: Имя Телефон");
                    continue;
                }

                String name = parts[0];
                String phone = parts[1];

                phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phone);
                System.out.println("Добавлен телефон " + phone + " для контакта " + name);
            }
        }
        scanner.close();
    }

    private static Map<String, Set<String>> loadPhoneBook() {
        Map<String, Set<String>> phoneBook = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String[] phones = parts[1].trim().split(",\\s*");
                    phoneBook.put(name, new HashSet<>(Arrays.asList(phones)));
                }
            }
            System.out.println("Данные загружены из файла.");
        } catch (IOException e) {
            System.out.println("Файл телефонной книги не найден. Будет создан новый.");
        }
        return phoneBook;
    }

    private static void savePhoneBook(Map<String, Set<String>> phoneBook) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
                writer.write(entry.getKey() + ": " + String.join(", ", entry.getValue()));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении телефонной книги: " + e.getMessage());
        }
    }

    private static void printSortedPhoneBook(Map<String, Set<String>> phoneBook) {
        List<Map.Entry<String, Set<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        System.out.println("\nТелефонная книга (отсортировано по количеству телефонов):");
        for (Map.Entry<String, Set<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

