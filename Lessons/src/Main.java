public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] numbers = {3, 1, 2};
        System.out.println(sumArray(numbers, numbers.length -1));

        System.out.println(minArrayElement(numbers, 0));
    }

    private static int minArrayElement(int[] array, int i) {
        if (i < array.length) {
            int next = minArrayElement(array, i + 1);
            return Math.min(array[i], next);
        } else {
            return array[0];
        }
    }



    private static int sumArray(int[] array, int i) {
        if (i == 0) {
            return array[0];
        }
        return sumArray(array, i - 1) + array[i];
    }



   }