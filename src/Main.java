public class Main {
    public static void main(String[] args) {
        task1_3();
        task4_5();
    }

    public static void task1_3() {
        System.out.println("Задачи 1-3 \n");

        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение переменной dog - " + dog);
        System.out.println("Значение переменной cat - " + cat);
        System.out.println("Значение переменной paper - " + paper + "\n");

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Значение переменной dog - " + dog);
        System.out.println("Значение переменной cat - " + cat);
        System.out.println("Значение переменной paper - " + paper + "\n");

        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Значение переменной dog - " + dog);
        System.out.println("Значение переменной cat - " + cat);
        System.out.println("Значение переменной paper - " + paper + "\n");
    }

    public static void task4_5() {
        System.out.println("Задачи 4-5 \n");
        // Задание 4
        var friend = 19;
        System.out.println("Значение переменной friend - " + friend);
        friend = friend + 2;
        System.out.println("Значение переменной friend + 2 - " + friend);
        friend = friend / 7;
        System.out.println("Значение переменной friend / 7 - " + friend + "\n");

        //Задание 5
        var frog = 3.5;
        System.out.println("Значение переменной frog - " + frog);
        frog *= 10;
        System.out.println("Значение переменной frog + 10 - " + frog);
        frog /= 3.5;
        System.out.println("Значение переменной frog / 3.5 - " + frog);
        frog += 4;
        System.out.println("Значение переменной frog + 4 - " + frog);
    }
}