//import java.util.Scanner;
//import java.util.logging.Logger;
package task1;
//Задание №1
//📌 Дано четное число N (>0) и символы c1 и c2.
//📌 Написать метод, который вернет строку длины N, которая
//состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        String c1;
        String c2;
        int n;
        logger.info(" Введите значение c1:"); // a
        c1 = scanner.next();
        logger.info(" Введите значение c2:"); // ввести b
        c2 = scanner.next();
        logger.info(" Введите значение N:"); // ввести число
        n = scanner.nextInt();

        if (n <= 0){
            throw new Exception("Не валидное значение N");
        }

        for(int i = 0; i < n; i++){
            if (i % 2 == 0){
                System.out.println(c1);
            }
            if (i % 2 == 1){
                System.out.println(c2); // если деление с остатком , то значение нечетное
            }
        }
    }    
} // пишет абру кадабру, но работает с1-2, с2-3 INFO:  ┬тхфшЄх чэрўхэшх N: 4
//2
//3
//2
//3 все верно 
// буквы ввела 5 раз показал- верно