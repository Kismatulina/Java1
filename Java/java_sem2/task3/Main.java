import java.util.Scanner;
import java.util.logging.Logger;
//package task3;
/**Задание №3
📌 Посчитайте сколько ’’драгоценных камней’’ в куче ’’обычных
камней’’
📌 Пример: jewels = “aB”, stones = “aaaAbbbB”
📌 Результат: ”a3B1” */


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите значения драгоценностей");
        String jawels = scanner.next();
        logger.info("Введите строку содержащую обычные камни");
        String stones = scanner.next();
        if (jawels.length() == 0) {
            throw new Exception("Не введен ни один символ соответсвующий драгоценностям");
        }
        if (stones.length() == 0){
            throw new Exception("Не введен ни один символ соответсвующий куче обычных каменей");
        }

        int counter = 0; // создаем врем перем которая считает драгоцнсти
        StringBuilder sb = new StringBuilder();
        for(char c1: jawels.toCharArray()){ //проходим по этому массиву jawelString
            for(char c2: stones.toCharArray()){ // сравниваем с этим массивом
                if(c1 == c2){
                counter++; // если равны символы, то к счетчику прибавляем один
            }
        }
        sb.append(c1) // в StringBuilder добавляем с1,т.к искали jawels драгцнти его в строчке stones 
                .append(":") // затем здесь форматируем колво найденных значений
                .append(counter)
                .append("");
        counter = 0; // и обнуляем счетчик
        }
    logger.info(sb.toString());
    }

}
// ответ a:3B:1