package CodilityTasks.MaxProductOfThree;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

        Arrays.sort(A);
        int max = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        if (A[0] < 0 && A[1] < 0 && Math.abs(A[0]) + Math.abs(A[1]) > A[A.length - 1] + A[A.length - 2]) {
            max = A[0] * A[1] * A[A.length - 1];
        }
        if (A[A.length - 1] < 0) {
            max = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        }
        return max;
    }
}