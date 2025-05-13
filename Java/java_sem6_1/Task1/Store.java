package Java.java_sem6_1.Task1;

import java.util.*;

public class Store {
    private Set<NoteBook> notebooks = new HashSet();
    public void add(NoteBook notebook) {
        notebooks.add(notebook);
    }
    public void print() {
        for (NoteBook notebook : notebooks) {
        System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
        notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB");
        }
    }
    public void filter() {
        try (Scanner sc = new Scanner(System.in,"cp866")) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Бренд");
            int choice = sc.nextInt();
            int minValue = 0;
            Object osValue;
            switch (choice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ (в гигабайтах) > ");
                minValue = sc.nextInt();
                for (NoteBook notebook : notebooks) {
                    if (notebook.getRam() >= minValue) {
                     System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                     notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB");
                    }
                }
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД (в гигабайтах) > ");
                minValue = sc.nextInt();
                for (NoteBook notebook : notebooks) {
                    if (notebook.getHdSize() >= minValue) {
                        System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                        notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB");
                    }
                }
                break;
            case 3:
                System.out.println("Введите название ОС: Windows Linux MacOS > ");
                sc.nextLine();
                osValue = sc.nextLine();
                for (NoteBook notebook : notebooks) {
                    if (notebook.getOS().equals(osValue)) {
                        System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                        notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB");
                    }
                }
                break;
            case 4:
                System.out.println("Введите название Бренда: Acer Asus Dell HP Lenovo > ");
                sc.nextLine();
                osValue = sc.nextLine();
                for (NoteBook notebook : notebooks) {
                    if (notebook.getBrand().equals(osValue)) {
                        System.out.println(notebook.getBrand() + " " + notebook.getModel() + " " +
                        notebook.getOS() + " " + notebook.getRam() + "GB " + notebook.getHdSize() + "GB");
                    }
                }
                break;   
            default:
                System.out.println("Некорректный выбор критерия.");
            }
        }
    }
}