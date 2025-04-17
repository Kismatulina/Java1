package Java.java_sem3.task1;

import java.lang.reflect.Array;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class task1 {
    //Задание №1
//📌 Заполнить список десятью случайными числами.
//📌 Отсортировать список методом sort() и вывести его на экран.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,8,9,4,1,2,3,0,6,7));
        task1 task1 = new task1();
        System.out.println(task1.sortByCollections(list).toString());//сортировать по порядку
        System.out.println(task1.sortByComparator(list).toString());//отсортировать в обратном порядке
    }
    public List<Integer> sortByCollections(List<Integer> list){
        Collections.sort(list);
        return list;   // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] сортировать по порядку
    }

    public List<Integer> sortByComparator(List<Integer> list){
        Collections.sort(list, Collections.reverseOrder());
        return list; // [9, 8, 7, 6, 5, 4, 3, 2, 1, 0] в обратном порядке
    }  
} 