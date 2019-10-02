package CodilityTasks.ArrayInversionCount;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

        int distinctElements = (int) Arrays.stream(A).distinct().count();

        if (A.length <= 1 || (A.length == 2 && A[0] >= A[1]) || distinctElements == 1)
            return 0;

        int counter = 0;
        for (int i = A.length - 1; i > 0; i--) {
            for (int j = A.length - 2; j >= 0; j--) {
                if (i > j) {
                    if (A[i] < A[j]) {
                        counter++;
                    }
                }
            }
        }
        if (counter <= 1_000_000_000)
            return counter;
        return -1;
    }
}