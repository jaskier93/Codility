package CodilityTasks.Distinct;

import java.util.Arrays;

//codility score ->100%
class Solution {
    public int solution(int[] A) {
        if (A.length == 0)
            return 0;
        return (int) Arrays.stream(A)
                .distinct()
                .boxed()
                .count();
    }
}