package CodilityTasks.MaxProductOfThree;

import java.util.Arrays;

class Solution {
    public static int solution(int[] A) {
        int max, max2 = 0;
        Arrays.sort(A);
        max = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        if (A[0] < 0 && A[1] < 0) {
            max2 = A[0] * A[1] * A[A.length - 1];
        }
        if (A[A.length - 1] < 0) {
            max = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        }
        if (max2 > max)
            return max2;
        return max;
    }
}