package lesson_2.example2;

public class LinerSearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, 5));

    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length -1;
        while (left > 1) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                right = mid - 1;
            } else  {
                left = mid + 1;
            }
        }
        return -1;

    }
}
