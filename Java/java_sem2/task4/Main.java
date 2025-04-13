//package task4;
/**Задание №4
📌 Вам дается строка S и целочисленный массив индексов int
index[s.length]. Напишите программу, которая перетасует
символы в S таким образом, что символ c i-й позиции
переместится на индекс index[i] в результирующей строке.
📌 Пример: s = “cba”, index = [3,2,1]
📌 Результат “abc” */
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите исходную строку");
        String s = scanner.next();
        int[] array = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            logger.info("Введите значение индекса массива");
            array[i] = scanner.nextInt();
        }
        char[] result = new char[s.length()];
        for (int i = 0; i < array.length; i++){
            char temp = s.charAt(i);
            int tempIndex = array[i];
            result [tempIndex - 1] = temp;
        }
        logger.info(Arrays.toString(result));      
       
    }   
}
