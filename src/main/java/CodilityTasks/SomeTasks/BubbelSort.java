package CodilityTasks.SomeTasks;

import java.util.Arrays;

public class BubbelSort {
    public static int[] bubblesort(int[] array) {


        int temp;

        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {6, 4, 8, 2, 5, 1, 10, 3, 9, 7,44,22,16,16,44,16};
        bubblesort(array);
        Arrays.stream(array).distinct().forEach(System.out::println);

    }
}
