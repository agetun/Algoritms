package lesson_2;

import java.io.PrintStream;

public class Palindrom {

    public static void main(String[] args) {

        String s1 = "abcba";
        String s2 = "abca";
        int a = 123;
        int b = 121;
        System.out.println(isPalindrom(s1));
        System.out.println(isPalindrom(s2));
        System.out.println(isPalindrom(String.valueOf(a)));
        System.out.println(isPalindrom(String.valueOf(b)));

        System.out.println(isPalindrom3(a));
        System.out.println(isPalindrom3(b));
    }
    private static boolean isPalindrom (String s){
        String s2 = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                s2 = s2 + s.charAt(i);
            }
            return s.equals(s2);
        }
        private static boolean isPalindrom2(String s) {
        int size = s.length();
        for (int i = 0; i < size / 2; i++) {
            if (s.charAt(i) != s.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
        }

        private static boolean isPalindrom3(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int result = 0;
        while (x > result) {
            result = 10 * result + x % 10;
            x /= 10;  // x = x / 10 (одинаковые выражения)
        }
        return x == result || x == result / 10;
        }


}
