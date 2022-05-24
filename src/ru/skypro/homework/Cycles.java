package ru.skypro.homework;

public class Cycles {
    public static void main (String[] args) {
        NumberScreen(); //Задача 1
        Friday();       //Задача 2
        Comets();       //Задача 3
        PingPong();     //Задача 4
        Fibonachi();    //Задача 5
    }

    public static void NumberScreen() {
        /*
        Задание 1
        Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        В результате программы вывод должен получиться следующий:
        1 2 3 4 5 6 7 8 9 10
        10 9 8 7 6 5 4 3 2 1
         */
        System.out.println("Задача 1");
        int i = 0;
        while (i < 10){
            System.out.print(" " + ++i);
                 }
         System.out.println();
         System.out.println();
        for (; i > 0; i--){
            System.out.print(" " + i);
        }
        System.out.println();
    }
    private static void Friday(){
        /*
        Задание 2
        В вашей компании пятница является днем отчетным.
        Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием о том, что нужно подготовить еженедельный отчет.
        Условия задачи:
        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
         */

        System.out.println("Задача 2");
        int i = 3; // число от 1 до 7, в нашем случае число 3 - является пятницей
        for (; i < 32; i+=7){
            System.out.println("Сегодня пятница,"+ i + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();
}
    private static void Comets() {
    /*
    Задание 3
    Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и
    их можно будет увидеть. Для начала нам нужно посчитать траекторию движения кометы, которая пролетает
    рядом с Землей каждый 79-й год, начиная с нулевого.
    Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим
    ее в следующий раз.
    Условия задачи:
    В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год
    ее появления.
    Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до
    текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения
    периода расчета.
    В результате решения задачи в консоль должен вывестись следующий результат:
      1896
      1975
      2054
     */
        System.out.println("Задача 3");
        int year = 2022;
        int period = 79;
        int i = 0;
        for (; i <= year; i +=period){
           if (i >= year - 200){
               System.out.println(i);
           }
        }
        System.out.println(i);
        System.out.println();
    }
    private static void PingPong() {
     /*
    Задание 4
    Это задание очень любят давать на собеседованиях в разных вариациях, потому мы предлагаем его вам,
    чтобы вы оценили свои силы.
    Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка,
    вывести ping, а если число делится на 5 без остатка, вывести pong.
    Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
    Допускается наличие пустых строк в выводе.
    Вывод должен быть следующий:
        1:
        2:
        3: ping
        4:
        5: pong
        6: ping
        7:
        8:
        9: ping
        10: pong
        11:
        12: ping
        13:
        14:
        15: ping pong
        16:
        17:
        18: ping
        19:
        20: pong
    Критерии оценки
            – В консоль выводится значение из условия задачи
            – Цикл проходит по значениям и выполняет условие задачи деления цифр на 3 и 5
            – Код написан корректно и без ошибок.
            */
        System.out.println("Задача 4");

        for ( int i = 1; i < 31; i++) {
            System.out.print(i + ":");
            if ( i % 3 == 0 ){
                 System.out.print(" ping");
               }
            if ( i % 5 == 0 ){
                 System.out.print(" pong");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void Fibonachi () {
      /*
       Задание 5
       Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
       – Каждое следующее число равняется сумме двух предыдущих.
       Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
       Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
       Должно получиться следующее:
       0 1 1 2 3 5 8 13 21 34
       Справка
       Числа Фибоначчи – элементы числовой последовательности
       0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … ,
        в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел.
       Названы в честь средневекового математика Леонардо Пизанского.
       Критерии оценки
       – Код написан корректно и выполняет условия задачи при изменении значений переменной;
       – В коде не допущено ошибок или неверного использования конструкций; – Все условия задачи выполняются.
       */
        System.out.println("Задача 5");
        /*
         int current = 0, next = 1;
         for (int i = 0; i < 10; i = i + 2) {
         System.out.print(current + " ");
         System.out.print(next + " ");
         current += next;
         next += current;
         }
         */

      int oldSumma = 0;
      int summa = 1;
      int newSumma = 0;
        System.out.print(oldSumma + " " + summa);
      for (int i = 1; i < 9; i++){
          newSumma = summa + oldSumma;
          System.out.print(" " + newSumma);
          oldSumma = summa;
          summa = newSumma;
      }
        System.out.println();
    }
}
