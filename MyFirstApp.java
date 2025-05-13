/**public class MyFirstApp {	
    public static void main(String[] args) {
        //System.out.println("Write once, run anywhere"); //Write once, run anywhere
        System.out.println("Написано однажды, работает везде"); //Написано однажды, работает везде
    }
}
*/
import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Написано однажды, работает везде");
        //Scanner console = new Scanner(System.in);
        Scanner console = new Scanner(System.in, "cp866");// Маша, надо прописать "cp866"
        System.out.print("Введите свое имя: ");//маша ??? 
        System.out.println(console.nextLine());
    }
}