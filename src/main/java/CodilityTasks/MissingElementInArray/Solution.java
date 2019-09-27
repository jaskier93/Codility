package CodilityTasks.MissingElementInArray;

import java.util.*;

// more efficient solution, codility score = 100%
public class Solution {
    public int solution(int[] A) {

        int result = 1;

        //temporary boolean will serve as condition in loop
        boolean isMissingElementFound = false;

        //set will collect only distinct values
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= A.length + 1 && !isMissingElementFound; i++) {
            if (!set.contains(i)) {
                result = i;
                isMissingElementFound = true;
            }
        }
        return result;
    }
}