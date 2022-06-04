package ru.skypro.homework;

public class LineString {
    public static void main(String[] args) {
        /*
        Задание 1
        Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
        и бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
        Напишите четыре строки:
        первая с именем firstName — для хранения имени;
        вторая с именем middleName — для хранения отчества;
        третья с именем lastName — для хранения фамилии;
        четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
         Выведите в консоль фразу: “ФИО сотрудника — ….”
        В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
         */
        System.out.println(" Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        System.out.println ();
        /*
        Задание 2
        Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф. И. О. сотрудников,
        полностью написанные заглавными буквами (верхним регистром).
        Напишите программу, которая изменит написание Ф. И. О. сотрудника с  “Ivanov Ivan Ivanovich”
        на полностью заглавные буквы.
        В качестве строки с исходными данными используйте строку fullName.
        Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
         */
        System.out.println(" Задача 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные " + upperFullName + " сотрудника для заполнения отчета — …");
        System.out.println ();
        /*
        Задание 3
        Система, в которой мы работаем, не принимает символ “ё”.
        Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
         */
        System.out.println(" Задача 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println (fullName);
        System.out.println ("Меняем  букву ё на е в ФИО с помощью метода - .replace() ");
        String fullЁNotName = fullName.replace('ё', 'e');
        System.out.println (fullЁNotName);
        System.out.println ();
        System.out.println ("Меняем  букву ё на е в ФИО с помощью методов  - .split() и .contains()");
        String[] fullNameArr = fullName.split("");
        for (int i = 0; i < fullNameArr.length; i++ ){
             if(fullNameArr[i].contains("ё")){
                fullNameArr[i] = "е";
            }
        }
        fullЁNotName = "";
        for (String symbol : fullNameArr){
            fullЁNotName += symbol;
        }
        System.out.println (fullЁNotName);
        System.out.println ();
        System.out.println ("Меняем  букву ё на е в ФИО с помощью метода  - .toCharArray() ");
        char[] fullNameArrChar = fullName.toCharArray();
        for (int i = 0; i < fullNameArrChar.length; i++ ){
            if ( fullNameArrChar[i] == 'ё'){
                fullNameArrChar [i] = 'е';
            }
        }
        fullЁNotName = "";
        for (char letter : fullNameArrChar){
            fullЁNotName += letter;
        }
        System.out.println (fullЁNotName);
        System.out.println ();

        transformationSurnames(); // вызов задачи № 5

        largeLettersSurnames ();  // вызов задачи № 6

        replacementSymbolsLine (); //вызов задачи № 7

        deleteDuplicates();        //вызов задачи № 8


    }
    private static void  transformationSurnames () {
/*
 Задание 5
К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку
 с Ф. И. О. на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”
:лампочка: Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено.
 Их должен вычислить компьютер.
:sos: Подсказка - Определить индексы символов помогут методы indexOf() и lastIndexOf().
 */
        System.out.println(" Задача 5");
        String fullName = "Ivanov Ivan Ivanovich";
        String[] words = fullName.split(" ");
        String lastName = words[0];    //для хранения фамилии
        String firstName = words[1];   //для хранения имени
        String middleName = words [2]; //для хранения отчества
        System.out.println (fullName);
        System.out.println ("Имя сотрудника — " + firstName);
        System.out.println ("Фамилия сотрудника — " + lastName);
        System.out.println ("Отчество сотрудника — " + middleName);
        System.out.println ();
    }

    private static void largeLettersSurnames (){
/*
 Задание 6
Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать
 в “Ivanov Ivan Ivanovich”.
Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
:sos: Подсказка 1
Метод toCharArray() может быть полезен.
:sos: Подсказка 2
Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ.
*/
        System.out.println(" Задача 6");
        String fullName = "ivanov ivan ivanovich";
        System.out.println (fullName);
        char[] fullNameArrChar = fullName.toCharArray();
        fullNameArrChar[0] = Character.toUpperCase(fullNameArrChar[0]);
        for (int i = 1; i < fullNameArrChar.length; i++ ){
           if (fullNameArrChar[i-1]== ' '){
               fullNameArrChar[i] = Character.toUpperCase(fullNameArrChar[i]);
           }
        }
        fullName = "";
        for (char letter : fullNameArrChar){
            fullName += letter;
        }
        System.out.println (fullName);
        System.out.println ();
    }
    private static void replacementSymbolsLine (){
 /*
 Задание 7
Имеется две строки.
Первая: "135"
Вторая: "246"
Соберите из двух строк одну, содержащую данные "123456".
Использовать сортировку нельзя.
Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
Выведите результат в консоль в формате: “Данные строки — ….”
:sos: Подсказка
Следует использовать StringBuilder.
  */
        System.out.println(" Задача 7");
        StringBuilder line1 = new StringBuilder("135");
        StringBuilder line2 = new StringBuilder("246");
        StringBuilder result = new StringBuilder("");
        System.out.println("дано две строки первая - "+ line1 + " вторая " + line2);
         for ( int i = 0; i < line1.length(); i++){
             result.append(line1.charAt(i));
             result.append(line2.charAt(i));
         }
        System.out.println("получаем третью строку " + result);
        System.out.println ();
    }
    private static void deleteDuplicates (){
  /*
  Задание 8
Дана строка из букв английского алфавита "aabccddefgghiijjkk".
Нужно найти и напечатать буквы, которые дублируются в строке.
Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
В итоге в консоль должен быть выведен результат программы: "acdgijk".
Критерии оценки
– Данные в строке отсортированы корректно.
– При изменении содержания строки результат программы выполняется.
– Результат программы выведен в консоль согласно условиям задачи.
   */
        System.out.println(" Задача 8");
        StringBuilder line = new StringBuilder("aabccddefgghiijjkk");
        System.out.println("есть строка " + line);
        StringBuilder result = new StringBuilder("");
        result.append(line.charAt(0));
        char a = ' ';
        char b = ' ';
        boolean indicator = false;
        for (int i = 1 ; i < line.length(); i++){
             a = line.charAt(i);
             b = line.charAt(i - 1);
             if( a != b ){
                 result.append(line.charAt(i));}
        }
        System.out.println("удаляем одинаковые символы и получаем строку  " + result);
        System.out.println ();
    }
}
