package ru.skypro.homework;
/*
Доиашнее задание 1.3 Условные операторы
 */
public class ConditionalStatements {

    public static void main(String[] args) {
        System.out.println();
        WebsiteBank();          //Задание 1
        YearOptsionnayaSystem();//Задание 2
        LeapYear();             //Задание 3
        TimeDelivery();         //Задание 4
        Month();                //Задание 5
        CreditMap();            //Задание 6
        Credit();               //Задание 7
    }

    public static void WebsiteBank() {
        /*
        Задание 1
        Представим, что мы работаем в банке. У нашего банка есть сайт, на который можно зайти с компьютера
        или телефона, а также мобильное приложение. И нам, и клиенту удобнее с телефона пользоваться мобильным
        приложением. Поэтому каждый раз, когда пользователь заходит на сайт с телефона, мы должны выдавать ему
        ссылку на скачивание приложения. Но мы не знаем, iOS или Android он использует.
        Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее
        сообщение для обоих вариантов.
        Объявите переменную clientOS, которая равна 0 или 1. Где 0 — iOS, 1 — Android.
        При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
        Например, для iOS оно будет звучать так:
        «Установите версию приложения для iOS по ссылке».
        А для Android так:
        «Установите версию приложения для Android по ссылке».
         */
        System.out.println(" Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void YearOptsionnayaSystem() {
        /*
        Задание 2
        К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона, но и год его
        создания: от этого зависит, подойдет ли приложение для телефона или оно просто не установится.
        Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
        Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную версию приложения.
        Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий
        — операционной системы телефона (iOS или Android) и года производства.
        Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
        Например, для iOS оно будет звучать так:
        «Установите облегченную версию приложения для iOS по ссылке».
        А для Android так:
        «Установите облегченную версию приложения для Android по ссылке».
        При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение об установке приложения.
        Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать любой желаемый год.
        **Важно**: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
         */
        System.out.println(" Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2012;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println();
    }

    public static void LeapYear() {
        /*
        Задание 3
        Напишите программу, которая определяет, является ли год високосным или нет.
        Переменную года назовите year, в которую можно подставить значение интересующего нас года.
        Например, 2021.
        Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        « …. год является високосным».
        или
        «... год не является високосным».
        Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
         Также високосным является каждый четырехсотый год.
         */
        System.out.println(" Задание 3");
        int year = 2021;
        System.out.println(year % 100 + " деление на 100");
        System.out.println(year % 400 + " деление на 400");
        System.out.println(year % 4 + " деление на 4");

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }

    public static void TimeDelivery() {
        /*
        Задание 4
        Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку
        банковских карт на дом с четкой датой доставки. Чтобы известить клиента о том, когда будет доставлена
        его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
        Правила доставки такие:
        Доставка в пределах 20 км занимает сутки.
        Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        Напишите программу, которая выдает сообщение в консоль:
        "Потребуется дней: " + срок доставки
        Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
         */
        System.out.println(" Задание 4");
        int deliveryDistance = 108;
        int limitation = 20;
        int stepDistance = 40;
        int numberDays = 1;
        if (deliveryDistance > limitation) {
            numberDays += ((deliveryDistance - limitation) / stepDistance);
            if ((deliveryDistance - limitation) % stepDistance > 0) {
                numberDays++;
            }
        }
        System.out.println("Потребуется дней: " + numberDays);
        System.out.println();

        int distance = 95;
        int days = 1;

        if (distance >= 20)
            days++;
        if (distance >= 60)
            days++;
        System.out.println("Потребуется дней: " + days + " для доставки");
        System.out.println();
    }

    public static void Month() {
        /*
        Задание 5
        Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        Например, 1 месяц (он же январь) принадлежит к сезону зима.
        Для написания программы используйте оператор switch.
        Для обозначения номера месяца используйте переменную monthNumber = 12.
        Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
        */
        System.out.println(" Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        System.out.println();
    }

    public static void CreditMap(){
        /*
        Задание 6.
        И снова дела банковские, уже сложнее.
        В нашем банке можно, кроме дебетовых, получать еще и кредитные карты.
        У таких карт есть допустимый лимит средств, который рассчитывается исходя из возраста клиента и его зарплаты.
        Правила расчета следующие:
        Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
        Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
        Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
        Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
        Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
        Вводные данные:переменная age = 19 для обозначения возраста клиента,
         salary = 58_000 для обозначения зарплаты клиента.
        Увеличения не могут быть применены одновременно. Необходимо вывести максимальный лимит в консоль
        в формате: «Мы готовы выдать вам кредитную карту с лимитом *** рублей».
        Критерии оценки:
        – При изменении значения переменной age результат вывода в консоль изменяется согласно условиям задачи
        – При изменении значения переменной salary результат вывода в консоль изменяется согласно условиям задачи
        – Написанный код отрабатывает условия задачи и изменение значений переменных, выводит в консоль корректный результат
        – Правила синтаксиса и пунктуации соблюдены.
         */
        System.out.println(" Задание 6");
        int wage = 0;              //Сумма допустимого кредита
        int age = 19;              //возраст кредитора
        int salary = 58_000;       //зарплата кредитора
        double limitMinimum = 1.2; //заработная плата клиента выше (или равно) 50 тыс, мы увеличиваем лимит в 1.2 раза
        double limitMaximum = 1.5; //заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза
        int increaseMinimum = 2;   //кредитор младше 23 лет мы предоставляем лимит кредита в размере в 2 зарплат
        int increaseMaximum = 3;   //кредитор старше (или равно) 23 лет мы предоставляем лимит кредита в размере 3 зарплат

        if (age >= 23) {
            wage = salary * increaseMaximum;
        } else {
            wage = salary * increaseMinimum;
        }
        if (salary >= 50_000) {
            wage = (int)(wage * limitMinimum);
        } else if (salary >= 80_000){
            wage = (int)(wage * limitMaximum);
        }
           System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + wage + " рублей");
           System.out.println();
    }

    public static void Credit(){
        /*
        Задание 7
        Расширим задачу с кредитованием. Прежде чем выдавать кредиты наш банк проводит аудит и оценивает
        клиентов и их возможность выплачивать кредит. Для того, чтобы вывести предварительное решение, нам
        необходимо использовать данные о возрасте, зарплате и желаемой сумме.
        Правила следующие:
        Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев.
        Максимальный ежемесячный платеж — 50% от ЗП. Если возраст меньше 23, то добавляем 1% к ставке.
        Если возраст меньше 30, то добавляем 0.5% к ставке. Если зарплата больше 80_000, уменьшаем ставку на 0.7%.
        Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.
        Вводные данные: используйте переменные age = 25 для обозначения возраста,salary = 60_000 для обозначения
        зарплаты,wantedSum = 330_000 для обозначения желаемой суммы кредита.
        Подсчитайте и выведите ответ, одобрен кредит или нет. На основании зарплаты подсчитайте максимальный
        допустимый платеж. Если максимальный допустимый платеж по ЗП больше стандартного платежа по кредиту согласно
         процентной ставке, то кредит одобрен, если меньше — отказан.
        Пример ответа в консоль: «Максимальный платеж при ЗП *** равен *** рублей. Платеж по кредиту *** рублей.
         Одобрено/отказано».
        Критерии оценки:
         – При изменении значения переменной age результат вывода в консоль изменяется согласно условиям задачи
         – При изменении значения переменной salary результат вывода в консоль изменяется согласно условиям задачи
         – Написанный код отрабатывает условия задачи и изменение значений переменных, выводит в консоль
          корректный результат
         – Нет вложенности в коде.
         */
        System.out.println(" Задание 7");
        int age = 25;                 //возраст кредитора
        int salary = 60_000;          //зарплата кредитора
        int wantedSum = 330_000;      //запрашиваемый кредит
        double minBid = 0.5;          //если возраст меньше 30 то 0,5% прибавка к ставке
        double Bid = 0.7;             //если зарплата больше 80_000, уменьшаем ставку на 0.7%
        double maxBid = 1;            //если возраст меньше 23 то 1% прибавка к ставке
        int numberMonths = 12;        //количество оплачиваемых месяцев (у нас 12 в году)
        int monthlyPayment = 0;       //месячный платеж по кредиту
        double basicBidYear = 10;     //базовая ставка в процентах 10%

        if (age < 30) {
            basicBidYear += minBid;
         } else  if (age < 23) {
            basicBidYear += maxBid;
          }
        if (salary > 80_000) {
            basicBidYear -= Bid;
        }
            monthlyPayment = (int)(((1.0*wantedSum/100)*basicBidYear + wantedSum)/numberMonths);

        if (monthlyPayment > salary/2) {
            System.out.println(" Максимальный платеж при ЗП "+ salary + " равен " + monthlyPayment + " рублей." +
                    " Платеж по кредиту " + wantedSum + " рублей.  Отказан.");
        } else {
            System.out.println(" Максимальный платеж при ЗП "+ salary + " равен " + monthlyPayment + " рублей." +
                    " Платеж по кредиту " + wantedSum + " рублей.  Одобрен.");
        }
    }

}