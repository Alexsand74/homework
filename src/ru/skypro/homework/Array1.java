package ru.skypro.homework;

import java.util.Arrays;

public class Array1 {
    public static void main (String[] args) {
        /*
        1 задача
        Объявите три массива:
        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
         - Подсказка
        ```java
        //объявление массива из 12-ти элементов, заполненного нулями
        int [] weight = new int [12];
        ```

        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
         - Подсказка
        ```java
        //объявление целочисленного массива, заполненного 12 элементами
        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        ```

         3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ
         создания массива: с помощью ключевого слова или сразу заполненный элементами.
          - **Критерии оценки**
          - Целочисленный массив создан с помощью ключевого слова new
          - Массив с дробными числами создан и сразу заполнен значениями
          - Создан любой произвольный массив одним из двух способов, рассмотренных в уроке
         */
        System.out.println("Задача 1 условие 1");
        int [] weight = new int [3];
        int j = 1;
        for (int i = 0; i < weight.length; i++){
               weight[i] = j++;
        }
        System.out.println(Arrays.toString(weight));
        System.out.println();

        System.out.println("Задача 1 условие 2");
        float [] arrey = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(arrey));
        System.out.println();

        System.out.println("Задача 1 условие 3");
        int [] variable = {90, 91, 93, 92, 85, 87, 84, 83};
        System.out.println(Arrays.toString(variable));
        System.out.println();

        // Задача 2 вывод массивов на консоль в порядке возрастания индексов
        task2Int(weight);
        task2Flot(arrey);
        task2Int(variable);
        // Задача 3 вывод массивов на консоль в порядке убывания индексов
        task3Int(weight);
        task3Flot(arrey);
        task3Int(variable);
        // Задача 4 вывод массива и замена нечетных элементов на четные
        task4Int(weight);
        task4Int(variable);
        // Задача 5 вывод единиц в двухмерном массиве по диагоналям
        task5Int();
        // Задача 6 перевенуть все элементы массива в обратном порядке c использованием дополнит массива
        task6Int();
        // Задача 7 перевенуть все элементы массива в обратном порядке без использования дополнит масиива
        task7Int();
        // Задача 8 Необходимо найти два числа, в массиве, сумма которых равна −2.
        task8Int();
        // Задача 9 Необходимо найти все пары чисел, в массиве, сумма которых равна −2.
        task9Int();
    }

    private static void task2Int(int [] wei) {
        /*
        2 задача
        Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        начиная с первого элемента, через запятую. Запятая между последним элементом одного
        массива и первым элементом следующего не нужна.
        - **Критерии оценки**
          - В консоль выведены все элементы первого массива в верном порядке через запятую
          - В консоль выведены все элементы второго массива в верном порядке через запятую
          - В консоль выведены все элементы третьего массива в верном порядке через запятую
          - На одной строчке расположены элементы только одного массива
         */
        System.out.println("Задача 2 условие для int");
        int i = 0;
        while (i < wei.length) {
            String comma = ", ";
            if (i == wei.length-1) { comma = " ";}
            System.out.print( wei [i] + comma );
            i++;
        }
        System.out.println("\n");
    }

    private static void task2Flot(float [] wei) {
        /*
        2 задача описание выше
        */
        System.out.println("Задача 2 условие для float");
        for (int i = 0; i < wei.length; i++ ){
            String comma;
            comma = ", ";
            if (i == wei.length-1) { comma = " "; }
            System.out.print( wei [i] + comma );
        }
        System.out.println("\n");
    }

    private static void task3Int(int [] wei) {
        /*
        3 задача
        Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не
        с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую,
        при этом элементы одного массива располагаются на одной строчке, а элементы другого массива
        – на другой.
        Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        Если во втором задании в консоль у вас вывелся результат
         1, 2, 3
         1.57, 7.654, 9.986
        *произвольные элементы третьего массива*
        То в третьем задании результат должен быть
         3, 2, 1
         9.986, 7.654, 1.57
        *произвольные элементы третьего массива в обратном порядке*
         */
        System.out.println("Задача 3 условие для int");
        for (int i = wei.length - 1; i > -1 ; i-- ){
            String comma = ", ";
            if (i == 0) { comma = " ";   }
            System.out.print( wei [i] + comma );
        }
        System.out.println("\n");
    }
    private static void task3Flot(float [] wei) {
        /*
        3 задача описание выше
        */
        System.out.println("Задача 3 условие для float");
        for (int i = wei.length - 1; i > -1 ; i-- ){
            String comma;
            comma = ", ";
            if (i == 0) { comma = " ";   }
            System.out.print( wei [i] + comma );
        }
        System.out.println("\n");
    }

    private static void task4Int(int [] wei) {
        //
        //4 задача
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем
        //сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для
        //решения задания вам нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.
        //
        System.out.println("Задача 4 условие для int");
        String comma;
        comma = ", ";
        for (int i = 0; i < wei.length; i++ ){
            if ( wei[i] % 2 != 0 ) {
                wei[i]++;
            }
            if (++i == wei.length) { comma = " "; }
            i--;
            System.out.print( wei [i] + comma );
        }
        System.out.println("\n");
    }

    private static void task5Int() {
       /*
        Задание 5
        Создайте матрицу 3 х3(двумерный массив типа int).Заполните единицами обе диагонали матрицы
         и напечатайте ее в консоль.Постарайтесь заполнить обе диагонали в одном цикле.
         Для печати следует использовать следующий код:
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        Критерии оценки:
        –В консоль выводится матрица 3 х3 со значениями единицы по диагонали.
        –При изменении единицы на другое значение матрица выводится в консоль корректно.
        –Для вывода результата в консоль используется один цикл.
       */
        System.out.println("Задача 5 Двухмерный массив заполнне обоих диагноалей единицами ");
        int[][] matrix = new int[7][7];

        for (int i = 0; i < matrix.length; i++)
        {   for (int k = 0; k < matrix.length; k++) {
                  if ( (i == k) ||  (k == (matrix.length-1) - i )){ matrix [i][k] = 1;
                   } else { matrix [i][k] = 0; }

                }
            }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    private static void task6Int() {
        /*
        Задание 6
        У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
        Нам дан массив чисел: {5, 4, 3, 2, 1}
        Необходимо привести его к виду: {1, 2, 3, 4, 5}
        Решите задачу с использованием дополнительного массива.
        Напечатайте массив до преобразования и после с помощью
        System.out.println(Arrays.toString(arr));
        Критерии оценки:
         – В консоль выведен результат программы до преобразований массива.
         – В консоль выведен результат программы после преобразований массива.
         – Программа выводит корректный результат при смене значений внутри массива.
         */
        System.out.println("Задача 6 перевернуть элементы массива в обратном порядке ");
        int [] arr ={5,4,3,2,1};
        System.out.println(" Коллега оставил нам не правельный масив: "+ Arrays.toString(arr));
        int [] arrTrue = new int[ arr.length];
        for (int i = 0; i < arr.length; i++ ){
            arrTrue [i] = arr [ (arr.length -1) - i];
        }
        System.out.println(" Поправили массив  коллеги на правельный: "+ Arrays.toString(arrTrue));
        System.out.println("\n");
    }

    private static void task7Int() {
        /*
         Задание 7
         Решите предыдущее задание, но без использования дополнительного массива.
         Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву
         из прошлого задания.
         Выведите результат программы в консоль тем же способом.
         Уточнения:
         Это задание не на сортировку.
         Не использовать Arrays.sort() и другие способы сортировок.
         Числа в порядке убывания даны исключительно для указания направления чтения.
         Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.
         Критерии оценки:
          – Задание решено без применения дополнительного массива.
          – В консоль выведен результат программы до преобразований массива.
          – В консоль выведен результат программы после преобразований массива.
          – Программа выводит корректный результат при смене значений внутри массива.
         */
        System.out.println("Задача 7 перевернуть элементы массива в обратном порядке ");
        int [] arr ={5,8,2,3,9,11};
        System.out.println(" Коллега оставил нам не правельный масив: "+ Arrays.toString(arr));
         int n,m;
        for (int i = 0; i < arr.length/2; i++ ){
               n = arr [i];
               m = arr [ (arr.length -1) - i];
               arr [i] = m;
               arr [ (arr.length -1) - i] = n;
        }
        System.out.println(" Поправили массив  коллеги на правельный: "+ Arrays.toString(arr));
        System.out.println("\n");
    }
    private static void task8Int() {
        /*
        Задание 8  Очень сложно.
        Задача, которая используется/бывает/встречается на собеседованиях.
        Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        Необходимо найти два числа, сумма которых равна −2.
        Напечатать эти числа в консоль.
        Подсказка
        Может потребоваться отсортировать массив с помощью Arrays.sort(arr).
        Критерии оценки
        – Найдены два числа, удовлетворяющие условию задачи.
        – При изменении значений массива в консоль выводится корректный результат.
        – В консоль выведен результат решения задания.
         */
        System.out.println("Задача 8 Необходимо найти два числа, сумма которых равна −2 ");
        int[] arr = new int[]{-6, 2, 5, -8, 8, 4, -7, 12, 1};
        System.out.println(" Вот   такой   массив   нам   данн : "+ Arrays.toString(arr));
        boolean markerLocationsSums = false;// маркер того что условие внутри выполнилось
        int i = 0;
        while ( i < arr.length && !markerLocationsSums){
           for (int k = i + 1; k < arr.length; k++){
                if (arr[i]+arr[k] == -2){
                    markerLocationsSums = true;
                    System.out.println(" первое число: " + arr[i] + " второе число: " + arr[k]);
                    break;
                }
            }  i++;
        }
        if ( !markerLocationsSums ){
            System.out.println(" чисел сумма которых дает -2 в массиве нет ");
        }
        System.out.println("\n");
    }

    private static void task9Int() {
        /*
        Задание 9  Очень сложно.
        Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2.
        Напечатайте их в консоль.
        Критерии оценки
        – Найдены все пары чисел, удовлетворяющие условию задачи.
        – При изменении значений массива в консоль выводится корректный результат.
        – В консоль выведен результат решения задания.
         */
        System.out.println("Задача 9 Необходимо найти все пары чисел, в массиве, сумма которых равна −2 ");
        int [] arr ={-6,2,5,-8,8,4,-7,12,1};
        System.out.println(" Вот   такой   массив   нам   данн : "+ Arrays.toString(arr));
        Arrays.sort(arr); // сортировка массива по возрастанию
        System.out.println(" Маcсив отсортирован по возрастанию: "+ Arrays.toString(arr));
        boolean markerLocationsSums = false;// маркер того что условие внутри выполнилось
        for (int i = 0; i < arr.length; i++ ) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] + arr[k] == -2) {
                    markerLocationsSums = true;
                    System.out.println(" первое число: " + arr[i] + " второе число: " + arr[k]);
                }
            }
        }
        if ( !markerLocationsSums ){
            System.out.println(" чисел сумма которых дает -2 в массиве нет ");
        }
        System.out.println("\n");
    }
 }
