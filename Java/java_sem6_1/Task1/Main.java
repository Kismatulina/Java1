package Java.java_sem6_1;

import Java.java_sem6_1.Task1.NoteBook;

//Урок 12. Семинар 6: Хранение и обработка данных ч3: множество коллекций Set
/**Задание 1. Поиск ноутбуков Подумать над структурой класса Ноутбук для магазина техники-
 *  выделить поля и методы.-Создать множество ноутбуков.-Написать метод, который будет
 *  запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 *  отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
 * Например: Введите цифру, соответствующую необходимому критерию: 1- ОЗУ 2- ОбъемЖД 
 * 3- Операционная система 4- Цвет …-
 * Далее нужно запросить минимальные значения для указанных критериев сохранить параметры
 *  фильтрации можно также в Map.-Отфильтровать ноутбуки их первоначального множества
 *  и вывести проходящие по условиям. */

public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("HP", "Pavilion", "Windows", 8, 256);
        NoteBook notebook2 = new NoteBook("Lenovo", "IdeaPad", "MacOS", 16, 512);
        NoteBook notebook3 = new NoteBook("Dell", "Inspiron", "Windows", 4, 128);
        NoteBook notebook4 = new NoteBook("Asus", "Vivobook", "Linux", 8, 512);
        NoteBook notebook5 = new NoteBook("Acer", "Vivobook", "MacOS", 32, 512);
        Store store = new Store();
        store.add(notebook1);
        store.add(notebook2);
        store.add(notebook3);
        store.add(notebook4);
        store.add(notebook5);
        store.print();
        store.filter();
    }
}