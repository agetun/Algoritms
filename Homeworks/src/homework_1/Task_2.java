package homework_1;
/*
2. Find the element that appears once in a sorted array
Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.

*/

/*
Алгоритм
1. Установить два указателя на начало и конец отсортированного массива.
2. Пока указатели не пересеклись, найти средний элемент массива.
3. Если средний элемент равен соседним элементам, значит, он встречается дважды, и мы можем пропустить половину массива, которая содержит этот элемент.
4. Если средний элемент не равен соседним элементам, то это искомый элемент, и мы можем вернуть его.
5. Если ни один из элементов не встречается один раз, верните null.
*/

public class Task_2 {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4};
        System.out.println("Искомый элемент " + searchNumber(array));

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

}
