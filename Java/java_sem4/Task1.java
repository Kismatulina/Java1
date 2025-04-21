package Java.java_sem4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**Задание №1
Даны два Deque представляющие два неотрицательных целых числа. Цифры
хранятся в обратном порядке, и каждый из их узлов содержит одну цифру.
Сложите два числа и верните сумму в виде связанного списка. */

public class Task1 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // rezult [6,6,0,1]
        Task1 task1 = new Task1();
        System.out.println(task1.sum(d1, d2).toString());
    }

    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2){
        if(d1 == null || d2 == null){
            throw new IllegalStateException();
        }
        Deque<Integer> rezult = new ArrayDeque<>();
        int diqit = 0; //врем переменная
        while (d1.size() > 0 || d2.size() > 0){
            int sum = 0 + diqit;
            diqit = 0; // обнулили
            if(d1.size()>0){
                sum = sum + d1.poll();
            }
            if(d2.size()>0){
                sum = sum + d2.poll();
            }
            if(sum > 9){ //когда сумма сформирована, проверяем если больше 9, то значению diqit присваиваем 1
                diqit = 1;
                sum = sum - 10; // а из суммы вычитаем 10 [6,6,0,1] 3+7=10; 10-10=0
            }
            rezult.offer(sum);            
        }
        if(diqit!=0){ //не рассмотрели когда на последней итерации остались 10ки 
            rezult.offer(diqit);// их нужно перенести ? [6,6,0,1] 3+7=10; 10-10=0; diqit = 1 перенесли?
        }
        return rezult;
    }    
}
