package Java.java_sem3.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * ДЗ Урок 6. Семинар: Коллекции JAVA: Введение (это 3 семинар)
 * Пусть дан произвольный список целых чисел
 * 1) Нужно удалить из него четные числа 
 * 2) Найти минимальное значение
 * 3) Найти максимальное значение
 * 4) Найти среднее значение 
 */
public class task3_1 {

    public static void main(String[] args) {
            Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        /*
        // Закомментированный пример из задания:
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {    // =/= как поставить не равно? 02468 будут четные числа
                continue;
            }
            System.out.println(i);  // 13579 если число четное, то после оператора continue вернись к i++, проверь условие и делай дальше
            //System.out.println();
        }
        */
        
        // 1) Удаление четных чисел
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0) {  // Удаляем четные числа
                iterator.remove();
            }
        }
        
        // 2) Нахождение минимального значения
        Collections.sort(nums);
        System.out.println("Список без четных чисел: " + nums);
        System.out.println("Минимальное значение: " + nums.get(0)); 
        
        // 3) Нахождение максимального значения
        System.out.println("Максимальное значение: " + nums.get(nums.size()-1));

        // 4) Нахождение среднего значения
        int sum = 0;
        for (int i : nums) { 
            sum += i;
        }
        double average = (double) sum / nums.size();
        System.out.println("Среднее значение: " + average); 
    }
}
/**
Список без четных чисел: [1, 3, 5, 7, 9]
Список без четных чисел: [1, 3, 5, 7, 9]
Минимальное значение: 1
Минимальное значение: 1
Максимальное значение: 9
Среднее значение: 5.0 */
