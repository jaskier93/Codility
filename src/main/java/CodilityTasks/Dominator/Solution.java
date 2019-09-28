package CodilityTasks.Dominator;

import java.util.Arrays;

//codility score -> 60%
class Solution {
    public int solution(int[] A) {

        int array[] = new int[A.length];
        System.arraycopy(A, 0, array, 0, A.length);

        int distinctElements = (int) Arrays.stream(A)
                .distinct()
                .count();

        Arrays.sort(array);

        if (distinctElements == 1) {
            return 0;
        }

        if (distinctElements == A.length || A.length == 0 || A == null) {
            return -1;
        }

        if (distinctElements == 2 && array.length > 2) {
            int temp1 = 0;
            int temp2 = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[0] == array[i]) {
                    temp1++;
                }
                if (array[array.length - 1] == array[i]) {
                    temp2++;
                }
            }
            if (temp1 > temp2)
                return 0;
            return array.length - 1;
        }

        int biggestCounter = 1;
        int dominator = array[0];
        int counter = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1])
                counter++;
            else {
                if (counter > biggestCounter) {
                    biggestCounter = counter;
                    dominator = array[i - 1];
                }
                counter = 1;
            }
        }

        if (array[array.length - 1] == dominator) {
            biggestCounter++;
        }

        if (biggestCounter > array.length / 2) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] == dominator) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {2, 1, 1, 1, 3};
        solution.solution(array);
    }
}
