package lesson_2;

public class Task_2 {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4};
        System.out.println(searchNumber(array));

        int i = 3;
        int j = 2;
        int k = i ^ j;
        System.out.println(k ^ 2);

    }

    private static int searchNumber(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i += 2) {
            if (array[i] != array[i + 1]) {
                return array[i];
            }
        }
        return -1;

    }

    private static int searchNumber2(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];
        }
        return 0;

    }
}

