package CodilityTasks.CyclingRotation;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] A, int K) {

        if (K > A.length && A.length > 1)
            K = K % A.length;

        long distinctElements = Arrays.stream(A)
                .distinct()
                .count();

        if (A.length == 0 || K == 0 || K == A.length || distinctElements == 1)
            return A;

        int[] rotatedArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            rotatedArray[(i + K) % A.length] = A[i];
        }
        return rotatedArray;
    }
}