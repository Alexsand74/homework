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
    }
}
