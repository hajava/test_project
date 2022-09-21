public class Main {
    private static double dog = 8;
    private static double cat = 3.6;
    private static int paper = 763789;

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
        System.out.println("\nTask 1");
        System.out.println("-------");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2(){
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("\nTask 2");
        System.out.println("-------");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3(){
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("\nTask 3");
        System.out.println("-------");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4(){
        var friend = 19;
        System.out.println("\nTask 4");
        System.out.println("-------");
        System.out.println(friend);
        friend *= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }
    public static void task5(){
        var frog = 3.5;
        System.out.println("\nTask 5");
        System.out.println("-------");
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }
    public static void task6(){
        var fighter1 = 78.2;
        var fighter2 = 82.7;

        System.out.println("\nTask 6");
        System.out.println("-------");
        System.out.println(fighter1 + fighter2);
        System.out.println(fighter2 - fighter1);
    }
    public static void task7(){
        var fighter1 = 78.2;
        var fighter2 = 82.7;

        System.out.println("\nTask 7");
        System.out.println("-------");
        System.out.println(fighter2 - fighter1);
        System.out.println(fighter2 % fighter1);
    }
    public static void task8(){
        var totalHours = 640;
        var employeeHours = 8;
        var deltaEmployee = 94;
        var totalEmployee = totalHours / employeeHours;

        System.out.println("\nTask 8");
        System.out.println("-------");
        System.out.println("Всего работников в компании – " + totalEmployee + " человек.");
        totalEmployee += deltaEmployee;
        System.out.println("Если в компании работает " + totalEmployee +
                " человека, то всего " + (employeeHours * totalEmployee) +
                " часов работы может быть поделено между сотрудниками.");
    }
}