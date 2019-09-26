package CodilityTasks.CyclingRotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] A, int K) {

        if (K > A.length) {
            K = K % A.length;
        }

        long distinctElements = Arrays.stream(A)
                .distinct()
                .count();

        if (A == null || K == 0 || A.length > 100 || K > 100) {
            return null;
        } else if (K == A.length || K == 1 || distinctElements == 1) {
            return A;
        } else {
            List<Integer> arrayList = Arrays.stream(A)
                    .boxed()
                    .filter(c -> (c > -1001 && c < 1001))
                    .collect(Collectors.toList());

            List<Integer> rotatedList = new ArrayList<>();

            rotatedList.addAll(arrayList.subList(K - 1, arrayList.size()));
            rotatedList.addAll(arrayList.subList(0, K - 1));

            int[] rotatedArray = new int[rotatedList.size()];

          //  Collections.rotate(arrayList, K);

            for (int i = 0; i < rotatedList.size(); i++) {
                rotatedArray[i] = rotatedList.get(i);
            }

            return rotatedArray;
        }
    }
/*
    public static void main(String[] args) {
        int[] array = {3, 8, 9, 7, 6};
        Solution solution = new Solution();
        solution.solution(array, 3);
    }*/
}