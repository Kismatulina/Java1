package homework2_1;
/**д.з 1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого
запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

//public class task1 {
public class Answer {
        public static StringBuilder answer(String QUERY, String PARAMS) {
            // Напишите свое решение ниже
            StringBuilder result = new StringBuilder(QUERY);
            try {
                String[] pairs = PARAMS.substring(1, PARAMS.length() - 2).split(",");
                boolean isFirstParam = false;
                
                for (String pair : pairs) {
                    String[] keyValue = pair.split(":");
                    String key = keyValue[0].trim().replace("\"", "");
                    String value = keyValue[1].trim().replace("\"", "");
                    
                    if (!value.toLowerCase().equals("null")) {
                        result.append(key).append("='").append(value).append("' and ");
                    }
                }
                
                if (result.length() > 0) { // Отрезаем лишний AND
                    result.delete(result.length() - 5, result.length());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }
    }
    
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
        public static void main(String[] args) {
            String QUERY = "";
            String PARAMS = "";
            
            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                QUERY = "select * from students where ";
                PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
            } else {
                QUERY = args[0];
                PARAMS = args[1];
            }
            
            Answer ans = new Answer();
            System.out.println(ans.answer(QUERY, PARAMS));
        }
    } //select * from students where name='Ivanov' and country='Russia' and city='Moscow'