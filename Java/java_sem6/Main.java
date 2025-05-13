package Java.java_sem6;
/**ToyShop
Информация о проекте
Необходимо написать проект, для розыгрыша в магазине игрушек. Функционал должен содержать добавление новых игрушек и задания веса для выпадения игрушек.

Как сдавать проект
Для сдачи проекта необходимо создать отдельный общедоступный репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом репозитории, использовать пул реквесты на изменения. Программа должна запускаться и работать, ошибок при выполнении программы быть не должно. Программа, может использоваться в различных системах, поэтому необходимо разработать класс в виде конструктора

Напишите класс-конструктор у которого принимает минимум 3 строки, содержащие три поля id игрушки, текстовое название и частоту выпадения игрушки

Из принятой строки id и частоты выпадения(веса) заполнить минимум три массива.

Используя API коллекцию: java.util.PriorityQueue добавить элементы в коллекцию

Организовать общую очередь

Вызвать Get 10 раз и записать результат в файл */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Lottery();

        Lottery.put("1 Doll 10 0.10");
        Lottery.put("2 Car 15 0.15");
        Lottery.put("3 Ball 7 0.07");
        Lottery.put("4 Lego 5 0.06");
        Lottery.put("5 Clock 3 0.04");
        Lottery.put("6 Gun 20 0.20");
        Lottery.put("7 Solder 8 0.08");
        Lottery.put("8 Train 30 0.30");

        ArrayList<Toys> winners = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int wonToyId = Lottery.getToyId();
            Toys wonToy = Lottery.getToyById(wonToyId);
            assert wonToy != null;
            if (Lottery.checkAvailable(wonToy)) {
                winners.add(wonToy);
            }
        }
        Lottery.saveToFile("Result.txt", winners);
    }
}