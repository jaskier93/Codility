package CodilityTasks.OddOccurrencesInArray;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A) {

        ArrayList<Integer> convertedTableToDistinctElementList = Arrays.stream(A)
                .boxed()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));

        HashMap<Integer, Integer> map2 = new HashMap<>();

        List<Integer> convertedToIntegerTableElements = new ArrayList<>(A.length);
        for (int i : A) {
            convertedToIntegerTableElements.add(i);
        }

        for (Integer key : convertedTableToDistinctElementList) {
            Integer temp = 0;
            for (Integer convertedToIntegerTableElement : convertedToIntegerTableElements) {
                if (key == convertedToIntegerTableElement) {
                    temp++;
                    map2.put(key, temp);
                }
            }
        }

        Integer score = 0;
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1) {
                score = key;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 2, 3, 3, 3, 4, 1, 2, 3, 6, 6};
        int[] array2 = {44, 3, 3, 5, 5, 7, 3, 4, 8, 8};
        int[] array3 = {1, 3, 1, 5, 0, 3, 3, 5, 5, 7, 3, 4, 8, 8};
        solution.solution(array);
        solution.solution(array2);
        solution.solution(array3);
        System.out.println("Wynik = " + solution.solution(array));
        System.out.println("Wynik = " + solution.solution(array2));
        System.out.println("Wynik = " + solution.solution(array3));
    }
}