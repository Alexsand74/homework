package ru.skypro.homework;
/*
Домашнее задние 1.2 Переменные
 */
public class Main {

    public static void main(String[] args) {
	/*
	Задача 1.
    На уроке мы проходили разные типы переменных.
    Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их).
	 */
        byte box = 45;
        short apple = 25001;
        int car = 869046543;
        long human = 546673782920874L;
        float cake = 3.453f;
        double timber = 458.589624;
        System.out.println();

         /*
	 Задача 2.
     А теперь решите задание.
     В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться,
     что боксеры соответствуют своей весовой категории, и бой будет честным.
     Вес одного боксера – 78,2 кг
     Вес второго боксера – 82,7 кг
     Подсчитайте и выведите в консоль общий вес двух бойцов.
     Подсчитайте и выведите в консоль разницу между весами бойцов.
	  */
        float weightBoxerOne = 78.2f;
        float weightBoxerTwo = 82.7f;
        System.out.println("Общий вес двух боксеров = " + (weightBoxerOne + weightBoxerTwo) + " кг");
        System.out.println("Разница между весами боксеров будет = " + (weightBoxerTwo - weightBoxerOne) + " кг");
        System.out.println();

     /*
     Задача 3.
     За весом спортсмена следит не только сам спортсмен, но и его тренер.
     Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
     Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
     – Бананы – 5 штук (1 банан - 80 грамм);
     – Молоко – 200 мл (100 мл = 105 грамм);
     – Мороженое пломбир – 2 брикета по 100 грамм;
     – Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
      Смешать всё в блендере и готово.
     Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
     Результат напечатайте в консоль
      */
        int thingsBanana = 5;
        int weightBanana = 800;
        int volumeMilk = 200;
        int weightMilk_100gram = 105;
        int thingsCream = 2;
        int weightCream = 100;
        int thingsEgg = 4;
        int weightEgg = 70;
        int weightBreakfast = thingsBanana * weightBanana + volumeMilk / 100 * weightMilk_100gram
                + thingsCream * weightCream + thingsEgg * weightEgg;
        System.out.println("Полный вес завтрака из всех продуктов в граммах будет = " + weightBreakfast + " гр");
        double weightBreakfastKg = (double) weightBreakfast / 1000;
        //double weightBreakfastKg = (weightBreakfast / 1000 + ((weightBreakfast % 1000) * 0.001));
        System.out.println("Полный вес завтрака из всех продуктов в килограмах будет = " + weightBreakfastKg + " кг");
        System.out.println();

     /*
     Задача 4.
     Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться
     в своей весовой категории.
     Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
     Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм
     и сколько, если каждый день будет худеть на 500 грамм.
     Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
     Результаты подсчетов выведите в консоль.
      */
        int weightResetKg = 7;
        int weightKg = 1000;
        int weightLossMinimumDay = 250;
        int weightLossMaximumDay = 500;
        System.out.println("При потере спортсменом " + weightLossMinimumDay + " грамм в день он потеряет "
                + weightResetKg + " килограмм за = " + (weightResetKg * weightKg) / weightLossMinimumDay + " дней");
        System.out.println("При потере спортсменом " + weightLossMaximumDay + " грамм в день он потеряет "
                + weightResetKg + " килограмм за = " + (weightResetKg * weightKg) / weightLossMaximumDay + " дней");
        System.out.println();

     /*
     Задача 5.
     Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких
     сотен сотрудников. В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее
     он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение
     зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
     К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для
     следующих сотрудников:
     Маша получает 67 760 рублей в месяц
     Денис получает 83 690 рублей в месяц
     Кристина получает 76 230 рублей в месяц
     Каждому нужно увеличить зарплату на 10% от текущей месячной.
     Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и
     после повышения. Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между
     годовым доходом до и после повышения.
     Выведите в консоль информацию по каждому сотруднику.
     Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
      */
        double moneyOldMonthMasha = 67760;
        double moneyOldMonthDenis = 83690;
        double moneyOldMonthChristina = 76230;
        double moneyNewMonthMasha = 0;
        double moneyNewMonthDenis = 0;
        double moneyNewMonthChristina = 0;
        double moneyOldYearMasha = 0;
        double moneyOldYearDenis = 0;
        double moneyOldYearChristina = 0;
        double moneyNewYearMasha = 0;
        double moneyNewYearDenis = 0;
        double moneyNewYearChristina = 0;
        int addedPercent = 10;
        //Считаем новую месячную зараплату увеличенную с на добавленный процент для каждого сотрудника
        moneyNewMonthMasha = (moneyOldMonthMasha / 100) * addedPercent + moneyOldMonthMasha;
        moneyNewMonthDenis = (moneyOldMonthDenis / 100) * addedPercent + moneyOldMonthDenis;
        moneyNewMonthChristina = (moneyOldMonthChristina / 100) * addedPercent + moneyOldMonthChristina;
        //Считаем старую зарплату за год всех сотрудников
        moneyOldYearMasha = moneyOldMonthMasha * 12;
        moneyOldYearDenis = moneyOldMonthDenis * 12;
        moneyOldYearChristina = moneyOldMonthChristina * 12;
        //Считаем уже новую зарплату за год всех сотрудников
        moneyNewYearMasha = moneyNewMonthMasha * 12;
        moneyNewYearDenis = moneyNewMonthDenis * 12;
        moneyNewYearChristina = moneyNewMonthChristina * 12;
        //Все данные есть и готовы в выводу и вычислениям по каждому сотруднику, выводим их на консоль
        System.out.println("Маша теперь получает " + moneyNewMonthMasha + " рублей. Годовой доход вырос на "
                + (moneyNewYearMasha - moneyOldYearMasha) + " рублей. ");
        System.out.println("Денис теперь получает " + moneyNewMonthDenis + " рублей. Годовой доход вырос на "
                + (moneyNewYearDenis - moneyOldYearDenis) + " рублей. ");
        System.out.println("Кристина теперь получает " + moneyNewMonthChristina + " рублей. Годовой доход вырос на "
                + (moneyNewYearChristina - moneyOldYearChristina) + " рублей. ");

    }
}