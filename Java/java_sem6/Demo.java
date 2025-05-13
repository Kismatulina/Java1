package Java.java_sem6;


// Статический импорт:
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.*;
class Demo{
    public static void main(String[] args){
        int res;
// Отображается окно подтверждения:
        res=showConfirmDialog(null, // Родительское окно
        "Хотите увидеть белую панду?", // Сообщение красную
        "Вопрос", // Заголовок окна
        YES_NO_OPTION // Кнопки
    );
        // Упрощенная форма условного оператора:
        if(res==YES_OPTION){
            // Полный путь к файлу с изображением:
            //String file="d:/Pictures/Animals/panda.png";
            String file="D:\\Обучение IT аналитик\\2 ГОД ОБУЧЕНИЯ\\1 блок Java знакомство и как использовать базовый API\\Pictures/Белая панда.jpg";
            // Создание объекта изображения:
            ImageIcon img=new ImageIcon(file);
            // Отображается окно с картинкой:
            showMessageDialog(null, // Родительское окно
                img, // Изображение
                "Белая панда", // Заголовок окна Красная панда
                PLAIN_MESSAGE // Пиктограмма отсутствует
            );
        }
    }
}