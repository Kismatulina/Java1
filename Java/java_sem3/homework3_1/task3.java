package Java.java_sem3.homework3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * ДЗ Урок 6. Семинар: Коллекции JAVA: Введение (это 3 семинар)
 * Пусть дан произвольный список целых чисел
 * 1) Нужно удалить из него четные числа
 * 2) Найти минимальное значение
 * 3) Найти максимальное значение
 * 4) Найти среднее значение 
 */
public class task3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        nums.removeIf(n -> n % 2 == 0);
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println("Minimum is " + nums.get(0));
        System.out.println("Maximum is " + nums.get(nums.size()-1));


        int sum = 0;
            for(int i : nums){
                sum += i;
            }
        System.out.println("Average is " + (double) sum / nums.size());
    }
}
/**
[1, 3, 5, 7, 9]
Minimum is 1
Maximum is 9
Average is 5.0 */