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


    //92% score
    public int moreEfficientSolution(int[] A) {

        long rightHalfSum = 0;
        long leftHalfSum;
        long score;
        int arrayLength = A.length;

        if (A.length == 0)
            return 0;
        if (A.length == 2)
            return Math.abs(A[0] - A[1]);


        for (int i = 1; i < arrayLength; i++)
            rightHalfSum += A[i];

        leftHalfSum = A[0];
        score = Math.abs(rightHalfSum + leftHalfSum);

        for (int j = 1; j < arrayLength; j++) {
            if (Math.abs(rightHalfSum - leftHalfSum) < score)
                score = Math.abs(rightHalfSum - leftHalfSum);
            leftHalfSum += A[j];
            rightHalfSum -= A[j];
        }
        return (int) score;
    }
}