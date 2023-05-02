package homework_7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
Дано число, записанное своими разрядами в массиве, например,
число 546 будет представлено массивом [5, 4, 6].
Прибавить к этому "числу" 1.

Example 1:


Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].


Example 2:


Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].


Example 3:


Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
*/

public class Main {
    public static void main(String[] args) {
        sum1();
        System.out.println();

        sum2();
        System.out.println();

        sum3();
        System.out.println();

    }

    public static void sum1() {
        int[] number = {3, 4, 6};
        int s = 0;
        int len = number.length;
        for (int i = 0; i < len; i++) {
            s = s + number[len - i - 1] * (int)Math.pow(10, i);
        }
        System.out.println(s);

        s = s + 1;
        ArrayList<Integer> number2 = new ArrayList<>();
        while (s > 0) {
            number2.add(0, s % 10);
            s = s / 10;
        }
        System.out.println(number2);
    }

    public static void sum2() {
        int[] number = {3, 4, 5};
        String s = "";
        for (int i = 0; i < number.length; i++) {
            s = s + number[i];
        }
        int a = Integer.parseInt(s) + 1;
        String b = String.valueOf(a);
        int[] number2 = new int[b.length()];
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            number2[i] = Integer.parseInt("" + c);
        }
        System.out.println(Arrays.toString(number2));
    }

    public static void sum3() {
        int[] number = {7, 8, 8};
        for (int i = number.length - 1; i >= 0; i--) {
            if (number[i] !=9) {
                number[i] = number[i] + 1;
                break;
            } else {
                number[i] = 0;
            }
        }
        if (number[0] == 0) {
            int[] array = new int[number.length + 1];
            array[0] = 1;
            number = array;
        }
        System.out.println(Arrays.toString(number));
    }
}
