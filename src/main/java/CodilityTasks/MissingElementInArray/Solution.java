package CodilityTasks.MissingElementInArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] A) {

        if (A.length == 1 && A[0] > 1) {
            return 1;
        } else if (A.length == 1 && A[0] <= 0) {
            return 1;
        } else if (A.length > 1) {
            List<Integer> integerList = Arrays.stream(A)
                    .boxed()
                    .filter(c -> c > 0)
                    .collect(Collectors.toList());
            Collections.sort(integerList);

            for (int i = 0; i < integerList.size(); i++) {
                A[i] = integerList.get(i);
            }
            for (int i = 0; i < A.length; i++) {
                if (A[i] != i + 1) {
                    return i + 1;
                }
            }
        }
        return A.length + 1;
    }
}