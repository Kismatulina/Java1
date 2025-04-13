package Java.java_sem3.task0;

public class task0 {
    //Задание №0
    //📌 Даны следующие строки, cравнить их с помощью == и метода
    //equals() класса Object
    //📌 String s1 = "hello";
    //📌 String s2 = "hello";
    //📌 String s3 = s1;
    //📌 String s4 = "h" + "e" + "l" + "l" + "o";
    //📌 String s5 = new String("hello");
    //📌 String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
    public static void main(String[] args) {
       String s1 = "hello";
       String s2 = "hello";
       String s3 = s1;
       String s4 = "h" + "e" + "l" + "l" + "o";
       String s5 = new String("hello");
       String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

       System.out.println(s1 == s2);
       System.out.println(s1 == s3);
       System.out.println(s1 == s4);
       System.out.println(s1 == s5);
       System.out.println(s1 == s6);
    } 
}
// ответ:
//true- мехназим движка проверяет, что ранее чоздан hello и вместо того чтобы создавать , он возвращает на предыдущий созданный и поэтому s1 == s2 true
//true- String s3 = s1; тк является одним и тем же обьектом, s3 присвоили адрес s1
//true- "h" + "e" + "l" + "l" + "o"; здесь тоже получили исходную строку
//false- new String насильно создаем новую ссылку, по сути отключение оптимизации строк, поэтому false
//false- тоже отдельную ссылку создали 