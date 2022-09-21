public class Main {

    public static void main(String[] args) {
        Main.task1();
        Main.task2();
        Main.task3();
        Main.task4();
        Main.task5();
        Main.task6();
        Main.task7();
        Main.task8();
    }
    public static void task1(){
        int varInt = 1;
        byte varByte = 2;
        short varShort = 4;
        long varLong = 5L;
        float varFloat = 6.7f;
        double varDouble = 8.9;
        System.out.println("\nTask 1");
        System.out.println("-------");
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
    }

    public static void task2(){
        float varFloat = 27.12f;
        long varLong = 987_678_965_549L;
        double varDouble = 2.786;
        boolean varBoolean = false;
        short varShort = 569;
        short varShort2 = -159;
        int varInt = 27897;
        byte varByte = 67;

        System.out.println("\nTask 2");
        System.out.println("-------");
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varShort2 с типом short равно " + varShort2);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
        System.out.println("Значение переменной varBoolean с типом boolean равно " + varBoolean);
    }

    public static void task3(){
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int paperTotal = 480;

        System.out.println("\nTask 3");
        System.out.println("-------");
        System.out.println( "На каждого ученика рассчитано " + paperTotal / (firstClass + secondClass+thirdClass) + " листов бумаги.");
    }
    public static void task4(){
        byte minPerformance = 8;
        byte twenty = 20;
        int day = 24*60;
        int threeDays = day*3;
        int month = day*30;

        System.out.println("\nTask 4");
        System.out.println("-------");
        System.out.println("За 20 минут машина произвела бутылок "+ minPerformance * twenty + " штук ");
        System.out.println("За сутки минут машина произвела бутылок "+ minPerformance * day + " штук ");
        System.out.println("За три дня машина произвела бутылок "+ minPerformance * threeDays + " штук ");
        System.out.println("За месяц машина произвела бутылок "+ minPerformance * month + " штук ");
    }
    public static void task5(){
        byte paintAmount = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        int classes = paintAmount / (whitePerClass + brownPerClass);

        System.out.println("\nTask 5");
        System.out.println("-------");
        System.out.println("В школе, где " + classes + " классов, нужно " + classes * whitePerClass
                + " банок белой краски и " + classes * brownPerClass + " банок коричневой краски");

    }
    public static void task6(){

        byte bananas = 5;
        int bananasWeight = bananas * 80;
        short milk = 200;
        int milkWeight = ( milk / 100 ) * 105;
        byte icecream = 2;
        int icecreamWeight = icecream * 100;
        byte eggs = 4;
        int eggsWeight = eggs * 70;
        int totalWeight = bananasWeight + milkWeight + icecreamWeight + eggsWeight;
        int grPerKg = 1000;

        System.out.println("\nTask 6");
        System.out.println("-------");
        System.out.println("Вес по рецепту составляет " +
                totalWeight/(float)grPerKg + " килограмм ");
    }
    public static void task7(){
        byte totalKg = 7;
        int grPerKg = 1000;
        short minGramm = 250;
        short maxGramm = 500;
        int totalDaysMax = totalKg * grPerKg / minGramm;
        int totalDaysMin = totalKg * grPerKg / maxGramm;
        int totalDaysAvg = (totalDaysMax + totalDaysMin) / 2;

        System.out.println("\nTask 7");
        System.out.println("-------");
        System.out.println("Максимальное количество дней похудания - " + totalDaysMax);
        System.out.println("Минимальное количество дней похудания - " + totalDaysMin);
        System.out.println("Среднее количество дней похудания - " + totalDaysAvg);
    }
    public static void task8(){
        int salaryMasha = 67_760 ;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        byte percent = 10;
        int salaryMashaNew = salaryMasha * (100 + percent) / 100;
        int salaryDenisNew = salaryDenis * (100 + percent) / 100;
        int salaryKristinaNew =  salaryKristina * (100 + percent) / 100;
        int salaryMashaYear = (salaryMashaNew - salaryMasha) * 12;
        int salaryDenisYear = (salaryDenisNew - salaryDenis) * 12;
        int salaryKristinaYear =  (salaryKristinaNew - salaryKristina) * 12;

        System.out.println("\nTask 8");
        System.out.println("-------");
        System.out.println("Маша теперь получает " + salaryMashaNew + " рублей. " +
                "Годовой доход вырос на " + salaryMashaYear  + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisNew + " рублей. " +
                "Годовой доход вырос на " + salaryDenisYear  + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaNew + " рублей. " +
                "Годовой доход вырос на " + salaryKristinaYear  + " рублей.");
        }
}