package homework_5;

public class Main {

    /*
      Task 1. Сумма цифр числа
Дано натуральное число N. Вычислите сумму его цифр.
При решении этой задачи нельзя использовать строки,
списки, массивы (ну и циклы, разумеется).
    */
    public static void main(String[] args) {

//     Дано натуральное число N. Вычислите сумму его цифр.
//436 = 4 + 3 + 6
        int a = 436;
        int sum = 0;
        while (a > 0) {
            int b = a % 10;
            System.out.println(b);
            sum = sum + b;
            a = a / 10;
        }
        System.out.println(sum);
        System.out.println();
        System.out.println(sum(436));
        split1(436);
        System.out.println();
        System.out.println(split2(436));
        System.out.println();

    }

    private static int sum(int n) {
        //Базовый случай
        if (n < 10) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }

    /*
    Task 2. Цифры числа справа налево
Дано натуральное число N. Выведите все его цифры по одной,
в обратном порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки,
массивы (ну и циклы, разумеется). Разрешена только рекурсия и
целочисленная арифметика.
    */
    private static int split1(int n) {

        if (n < 10) {
            System.out.print(n + " ");
            return n;
        }
        System.out.print(n % 10 + " ");
        return split1(n / 10);
    }

    private static String split2(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        return split2(n / 10) + " " + n % 10;
    }
}
