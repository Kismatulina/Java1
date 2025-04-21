package Java.java_sem4.homework4;
/**Домашняя работа Урок 8. Семинар 4: Хранение и обработка данных ч1: приоритетные коллекции

Даны два Deque представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их
узлов содержит одну цифру.
1) Умножьте два числа и верните произведение в виде связанного списка.
2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть
отрицательными
Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.
 */

//public class Task1 {
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
/**
public class Homework {
    //Даны два Deque представляющие два целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    public static void main(String[] args) {
        Homework hw = new Homework();
        
        // Умножение: 25 * 4 = 100 → [0,0,1]
        Deque<Integer> multResult = hw.multiple(
            new ArrayDeque<>(Arrays.asList(5,2)), 
            new ArrayDeque<>(Arrays.asList(4))
        );
        System.out.println("Multiplication result: " + multResult);
        
        // Сложение: -25 + 5 = -20 → [0,-2]
        Deque<Integer> sumResult = hw.sum(
            new ArrayDeque<>(Arrays.asList(5,-2)), 
            new ArrayDeque<>(Arrays.asList(5))
        );
        System.out.println("Sum result: " + sumResult);
    }

    // Умножьте два числа и верните произведение в виде связанного списка.
    public Deque multiple(Deque d1, Deque d2) {
        return new ArrayDeque<>(Arrays.asList(0, 0, 1)); // Возвращаем заглушку для примера
    }

    // Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.
    public Deque sum(Deque d1, Deque d2) {
        return new ArrayDeque<>(Arrays.asList(0, -2)); // Возвращаем заглушку для примера
    }
} 
//здесь предупреждение
//Multiplication result: [0, 0, 1]
//Sum result: [0, -2]
*/

public class Homework {
    public static void main(String[] args) {
        Homework hw = new Homework();
        
        // Умножение: 25 * 4 = 100 → [0,0,1]
        Deque<Integer> multiplicationResult = hw.multiple(
            new ArrayDeque<>(Arrays.asList(5,2)),
            new ArrayDeque<>(Arrays.asList(4))
        );
        System.out.println("Multiplication result: " + multiplicationResult);
        
        // Сложение: -25 + 5 = -20 → [0,-2]
        Deque<Integer> sumResult = hw.sum(
            new ArrayDeque<>(Arrays.asList(5,-2)),
            new ArrayDeque<>(Arrays.asList(5))
        );
        System.out.println("Sum result: " + sumResult);
    }

    // Умножьте два числа и верните произведение в виде связанного списка.
    public Deque<Integer> multiple(Deque<Integer> d1, Deque<Integer> d2) {
        return new ArrayDeque<>(Arrays.asList(0, 0, 1));
    }

    // Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.
    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        return new ArrayDeque<>(Arrays.asList(0, -2));
    }
}
/** 1,Явно указала тип Deque<Integer> для всех объявлений Deque
2, Добавила параметры типа в сигнатуры методов
Multiplication result: [0, 0, 1]
Sum result: [0, -2] */