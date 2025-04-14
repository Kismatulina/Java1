/**Задание №2
📌 Напишите метод, который сжимает строку.
📌 Пример: вход aaaabbbcdd. */
import java.util.Scanner;
import java.util.logging.Logger;
//package task2;
//import java.util.Scanner;
//import java.util.logging.Logger;
public class Main { // ругается

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите исходную строку");
        String s = scanner.next();
        if(s.length() == 0){
            throw new Exception("Введена пустая строка");                
        }
        char c;  // создаем переменную чар, кот хранит символ из строчки
        StringBuilder sb = new StringBuilder(); // и создаем стрингбилдер кот содерж перечень уникальных символов
        c = s.charAt(0); // создали первый символ "с" в исходной строке
        sb.append(c); // и тут же добваим его в ранее созданный стрингбилдер
        for(char item: s.toCharArray()){  // создаем форидч (не важен индекс нам сейчас) он просто перебирает не храня в себе индекс:= перебирать хотим char item:, затем возьми строчку s и разбей на массив символов вхдящих в него toCharArray() 
            
            if(c != item){ // теперь сравнить "с" с item, если на равны, то добавляем item в наш стрингбилдер  
                sb.append(item);
            }
            c = item; // присваимваем переменной "с" значение item
        }
        logger.info(sb.toString());//логер принимает любой метод (info) тип стринг-строчку, но на данный момент имеем StringBuilder и нужно чтобы она собрала всё встрочку и это с помощью метода toString
    }
} //  abсd


