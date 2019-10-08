package CodilityTasks.PermCheck;

import java.util.*;

class Solution {
    public static int solution(int[] A) {

        if (A.length == 0)
            return 0;

        if (A.length == 1 && A[0] == 1)
            return 1;

        IntSummaryStatistics stats = Arrays.stream(A).distinct().summaryStatistics();
        int min = stats.getMin();
        int max = stats.getMax();
        double sumOfAllElements = (double) (min + max) * A.length / 2;
        double average = stats.getAverage();
        double averageOfAllArrayElements = sumOfAllElements / A.length;
        if (average == averageOfAllArrayElements && stats.getSum() == sumOfAllElements && min == 1)
            return 1;
        return 0;
    }
}