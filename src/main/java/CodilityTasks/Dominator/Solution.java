package CodilityTasks.Dominator;

import java.util.Arrays;

//codility score -> 66%
class Solution {
    public int solution(int[] A) {

        int arrayLength = A.length;

        int[] array = new int[arrayLength];
        System.arraycopy(A, 0, array, 0, arrayLength);

        int distinctElements = (int) Arrays.stream(A)
                .distinct()
                .count();

        if (distinctElements == 1) {
            return 0;
        }

        if (distinctElements == arrayLength || arrayLength == 0) {
            return -1;
        }

        Arrays.sort(array);

        if (distinctElements == 2) {
            int temp1 = 0;
            int temp2 = 0;
            for (int i1 : array) {
                if (array[0] == i1) {
                    temp1++;
                }
                if (array[arrayLength - 1] == i1) {
                    temp2++;
                }
            }
            if (temp1 > temp2)
                return 0;
            return arrayLength - 1;
        }

        int biggestCounter = 1;
        int dominator = array[0];
        int counter = 1;

        for (int i = 1; i < arrayLength; i++) {
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

        if (biggestCounter > arrayLength / 2) {
            for (int i = 0; i < arrayLength; i++) {
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
