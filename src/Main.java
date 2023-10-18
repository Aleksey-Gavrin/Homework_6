public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Результат выполнения задачи 1:");

//        Задача 1
//        С помощью цикла for выведите в консоль все числа от 1 до 10.

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Результат выполнения задачи 2:");

//        Задача 2
//        С помощью цикла for выведите в консоль все числа от 10 до 1.

        for (int i = 10; 1 <= i; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Результат выполнения задачи 3:");

//        Задача 3
//        Выведите в консоль все четные числа от 0 до 17.

        for (int i = 0; i < 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Результат выполнения задачи 4:");

//        Задача 4
//        Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.

        for (int i = 10; -10 <= i; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Результат выполнения задачи 5:");

//        Задача 5
//        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
//        В консоль результат должен выводиться в формате: «… год является високосным».

        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным.");
        }

        System.out.println();
        System.out.println("Результат выполнения задачи 6:");

//        Задача 6
//        Напишите программу, которая выводит в консоль последовательность чисел:
//        7 14 21 28 35 42 49 56 63 70 77 84 91 98

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Результат выполнения задачи 7:");

//        Задача 7
//        Напишите программу, которая выводит в консоль последовательность чисел:
//        1 2 4 8 16 32 64 128 256 512

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Результат выполнения задачи 8:");

//        Задача 8
//        Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
//        Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».

        int savings = 0;
        for (int month = 1; month <= 12; month++) {
            savings += 29_000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println();
        System.out.println("Результат выполнения задачи 9:");

//        Задача 9
//        Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под
//        проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате:
//        «Месяц …, сумма накоплений равна … рублей».

        int depositSavings = 0;
        for (int month = 1; month <= 12; month++) {
            depositSavings += 29_000;
            depositSavings += depositSavings / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + depositSavings + " рублей");
        }

        System.out.println();
        System.out.println("Результат выполнения задачи 10:");

//        Задача 10
//        Напишите программу, которая выводит в консоль таблицу умножения на 2:
//        2*1=2
//        2*2=4
//        2*3=6
//        2*4=8
//        2*5=10
//        2*6=12
//        2*7=14
//        2*8=16
//        2*9=18
//        2*10=20

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }

    }
}