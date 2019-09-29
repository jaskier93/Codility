package CodilityTasks.MaxProfit;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

        int distinctElements = (int) Arrays.stream(A).distinct().count();

        boolean sortedDescArray = false;

        if (A[0] - A[A.length - 1] == A.length - 1) {
            sortedDescArray = true;
        }

        if (A.length <= 1 || distinctElements == 1 || sortedDescArray) {
            return 0;
        }
        if (distinctElements == 2) {
            return A[1] - A[0];
        }

        int lowestPrice = A[0];
        int actualBiggestProfit = 0;

        for (int i = 1; i < A.length; i++) {
            actualBiggestProfit = Math.max(actualBiggestProfit, A[i] - lowestPrice);
            lowestPrice = Math.min(lowestPrice, A[i]);
        }
        return actualBiggestProfit;
    }
}