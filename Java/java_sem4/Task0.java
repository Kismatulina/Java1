package Java.java_sem4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**Java: знакомство и как использовать базовый API. Обучение в записи
Урок 8. Семинар: Хранение и обработка данных ч1: приоритетные коллекции */

public class Task0 {

/** Задание №0
Дан Deque состоящий из последовательности цифр. Необходимо проверить,
что последовательность цифр является палиндромом*/
    public static void main(String[] args) {
        //Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,2,1)); // симетрично стоят цифры ответ-true
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,2,3)); //поломаем,чтобы не являлась последовательность цифр палиндромом ответ-false
        Task0 task0 = new Task0();
        System.out.println(task0.checkOn(deque));        
    }
    public boolean checkOn(Deque<Integer> deque){
        if(deque == null){
            throw new IllegalStateException();
        }
        if(deque.size() <= 1){
            return true;
        }
        while (deque.size() >= 2){
            if(deque.pollFirst() != deque.pollLast()){
                return false;
            }
        }
        return true;
    }
}
