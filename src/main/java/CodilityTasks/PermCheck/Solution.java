package CodilityTasks.PermCheck;

import java.util.*;

class Solution {
    //TODO: 83%
    public int solution(int[] A) {
        int score = 0;
        long distinctElementsCounter = Arrays.stream(A)
                .boxed()
                .distinct()
                .count();
        if (distinctElementsCounter != A.length) {
            return 0;
        }

        long sum = Arrays.stream(A)
                .sum();

        List<Integer> integerList = new ArrayList<>(A.length);
        for (int i : A) {
            integerList.add(i);
        }
        Collections.sort(integerList);

        int sum2 = (integerList.get(0) + integerList.get(integerList.size() - 1)) * (integerList.size() / 2);

        if (integerList.get(integerList.size() - 1) > integerList.size() || (integerList.get(0) != 1) || distinctElementsCounter < A.length) {
            score = 0;
        } else if (((A.length == 1 && A[0] == 1) || (A.length == 2 && A[0] == 1 && A[1] == 2)) ||
                (distinctElementsCounter == integerList.size() && sum == sum2 && integerList.get(0) == 1 && integerList.get(integerList.size() - 1) == integerList.get(integerList.size() - 1))) {
            score = 1;
        }
        return score;
    }
}