package Java.java_sem3.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**Задание №2
📌 Создать список типа ArrayList<String>.
📌 Поместить в него как строки, так и целые числа. (вывести что число, а что строка)
📌 Пройти по списку, найти и удалить целые числа (не корректно написано задание, этого нет). */

public class task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        task2 task2 = new task2();
        task2.printResultOfCheck(list);
        }
    public void printResultOfCheck(List<String> list) {
        for (String s: list){
            try{
                int i = Integer.valueOf(s);
                System.out.println(i + "- число");
            }catch (NumberFormatException e){
                System.out.println(s + "- строка");
            }           
        }
    }    
}
/** ответ:
a- строка
2- число
b- строка
3- число
c- строка
4- число
 */