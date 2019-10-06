package CodilityTasks.PermCheck;

import java.util.*;

class Solution {
    public static int solution(int[] A) {

        if (A.length == 0)
            return 0;

        if (A.length == 1 && A[0] == 1)
            return 1;

        int sumOfAllElements = (int) Arrays.stream(A).distinct().sum();
        int max = Arrays.stream(A).max().getAsInt();
        int min = Arrays.stream(A).min().getAsInt();
        int arithmeticSeriesSum = (min + max) * A.length / 2;

        if (sumOfAllElements == arithmeticSeriesSum && max == A.length && min == 1)
            return 1;
        return 0;
    }
}