package ru.skypro.homework;

import java.util.Arrays;

public class Array2 {
    public static void main (String[] args) {
        /*
         Вводные данные для базовых задач
       Представим, что вы работаете в небольшой компании, и к вам часто обращаются коллеги из других отделов,
       чтобы вы помогли им настроить их работу.
       И вот к вам приходят коллеги из бухгалтерии и просят помощи с корпоративной бухгалтерской книгой.

       Каждый день месяца, включая выходные, компания тратит средства — некую сумму, причем в бухгалтерской
       книге хранится сумма затрат по дням (а не каждая сумма отдельно). То есть в книге 30 записей разных сумм.
       Эти суммы разнятся от 100 000 до 200 000.
       Ваш коллега по отделу написал код, который генерирует массив из 30 случайных чисел, и предложил прежде,
       чем писать программу для настоящей бухгалтерской книги, проверить всё на случайных числах
       от 100 000 до 200 000.
       Для получения массива случайных чисел достаточно объявить массив и вызвать указанный ранее метод.
       Метод инициализирует ваш массив и заполнит его случайными значениями от 100_000 до 200_000.

             int[] arr = generateRandomArray();

             public static int[] generateRandomArray() {
             java.util.Random random = new java.util.Random();
             int[] arr = new int[30];
             for (int i = 0; i < arr.length; i++) {
             arr[i] = random.nextInt(100_000) + 100_000;
              }
            return arr;
            }
        Этот метод можно скопировать и использовать далее при решении учебных задач или создать вручную собственный
        массив со случайными числами от 100 000 до 200 000.
         */
        //int [] arr = new int [30];
        int summa = 0;
        int [] arr = generateRandomArray(); // создаем заполненный массив arr
        summa = sumPerMonth( arr);          // вызов задачи  №1 сумма всех выплат за месяц
        maxMinSumDay( arr);                 // вызов задачи  №2 вывод дней с максимальной и минимальной тратой
        averageSumDay( summa, arr);         // вызов задаич  №3 расчет средней суммы трат в день
        coupWithBeginningsonTheEnd();     // вызов задачи  №4 переворот строки по символьно с начала на конец

    }
    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static int sumPerMonth (int[] arr) {
       /*
       Задание 1
       Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
       Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
       в формате: «Сумма трат за месяц составила … рублей».
        */
        System.out.println (" Задача 1");
       int sum = 0;
       for (int colum : arr){
           sum += colum;
       }
       System.out.println( "Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
        return sum;
    }
    private  static void maxMinSumDay (int[] arr){
        /*
        Задание 2
        Следующая задача — найти минимальную и максимальную трату за день.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */
        System.out.println (" Задача 2");
        int maximumSumDay = arr[0];
        int minimalSumDay = arr[0];
        for (int colum : arr){
            if (colum < minimalSumDay) {
                minimalSumDay = colum;
            }
            if (colum > maximumSumDay) {
                maximumSumDay = colum;
            }
        }
        System.out.println( "Минимальная сумма трат за день составила " + minimalSumDay + " рублей." +
                " Максимальная сумма трат за день составила " + maximumSumDay + " рублей.");
        System.out.println();
    }
    private  static  void averageSumDay (int summa , int[]arr){
        /*
        Задание 3
       А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
       Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за
        месяц поделить на количество дней), и вывести в консоль результат в формате:
        «Средняя сумма трат за месяц составила … рублей».
       **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
         */
        System.out.println (" Задача 3");
        double averageSumDay = (double) summa / arr.length;
        String result = String.format("%.2f",averageSumDay); // отбрасываем в числе лишние знаки после запятой (копееек)
        System.out.println ("Средняя сумма трат за месяц составила  " + result + " рублей.");
        System.out.println ();
    }
    private static void coupWithBeginningsonTheEnd(){
        /*
        Задание 4
        Отойдем от подсчетов.
        В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О. сотрудников начали отображаться в
        обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        Данные с именами сотрудников хранятся в виде массива символов (char[]).
        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".
        **Важно**: не используйте дополнительные массивы для решения этой задачи.
        * Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
         */
        System.out.println (" Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.print ("Символьный  массив  до  обработки - ");
        System.out.println (Arrays.toString (reverseFullName));
        int size =  reverseFullName.length - 1; // вводим переменную размер, что бы её не считать постоянно в итерациях цикла
        char min, max;
        //for (int i = 0; i < reverseFullName.length / 2 ; i++) { // в этом цикле массив обменивает конечные элементы на начальные
        //    min = reverseFullName [i];
        //    max = reverseFullName [ size - i];
        //    reverseFullName [i] = max;
        //    reverseFullName [size - i] = min;
        //   }
        for (int i = size; i > -1 ; i-- ){ // Просто выводится массив с последнего своего элемента к начальному
            System.out.print( reverseFullName[i] );
        }
           System.out.println ();
        //  System.out.print ("Символьный массив после обработки - ");
        //  System.out.println(Arrays.toString (reverseFullName));
          for (char symbol : reverseFullName){
           System.out.print(symbol);
          }
            System.out.println ();
    }
}