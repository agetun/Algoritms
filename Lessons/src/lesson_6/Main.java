package lesson_6;

public class Main {
    public static void main(String[] args) {
        System.out.println(powIter(2, 3));
        System.out.println(powRecur(2, 3));
        System.out.println(powRecur2(2, 4));

    }

    private static int powIter(int x, int n) {
        int p =1;
        for (int i = 0; i < n; i++) {
            p = p * x;
        }
        return p;
    }

    private static int powRecur(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powRecur(x, n - 1);
    }

    private static int powRecur2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int y = powRecur2(x, n/2);
        if (n % 2 == 0) {
            return y * y;
        } else {
            return x * y * y;
        }
    }
}
