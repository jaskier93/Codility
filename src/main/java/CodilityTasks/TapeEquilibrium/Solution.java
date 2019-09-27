package CodilityTasks.TapeEquilibrium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A) {

        List<Integer> integerList = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());

        if ((integerList.size() == 2 && integerList.get(0) == integerList.get(1)) || A.length == 1) {
            return 0;
        }
        if ((integerList.size() == 2 && integerList.get(0) != integerList.get(1))) {
            return Math.abs(integerList.get(0) - integerList.get(1));
        }

        int sublistSum1;
        int sublistSum2;

        List<Integer> scoreList = new ArrayList<>();

        Integer temp;
        for (int i = 1; i < integerList.size(); i++) {
            sublistSum1 = integerList.subList(0, i).stream().mapToInt(n -> n).sum();
            sublistSum2 = integerList.subList(i, integerList.size()).stream().mapToInt(n -> n).sum();
            temp = Math.abs(sublistSum1 - sublistSum2);

            scoreList.add(temp);
        }
        return scoreList.stream()
                .min(Integer::compareTo)
                .get();
    }
}

