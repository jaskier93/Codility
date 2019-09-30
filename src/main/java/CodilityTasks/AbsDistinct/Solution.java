package CodilityTasks.AbsDistinct;

import java.util.Arrays;

//codility score -> 100%
class Solution {

    public int solution(int[] A) {
        if (A.length == 1) {
            return 1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0)
                A[i] *= -1;
        }

        int distinctElements = (int) Arrays.stream(A).distinct().count();

        if (A.length == distinctElements) {
            return A.length;
        }
        return (int) Arrays.stream(A).distinct().count();
    }
}

