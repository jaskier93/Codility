package CodilityTasks.MissingElementInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A) {
        List<Integer> arrayList = Arrays.stream(A)
                .boxed()
                .filter(c -> c > 0 & c < 1_000_001)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        if (arrayList.isEmpty() || arrayList.get(0) != 1 || (arrayList.size() == 1 && arrayList.get(0) > 1) || arrayList.size() > 100_000) {
            return 1;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if ((arrayList.get(i + 1) - arrayList.get(i)) > 1) {
                //      System.out.println((arrayList.get(i)+1));
                return (arrayList.get(i) + 1);
            }
        }


        if (list.isEmpty()) {
            return arrayList.stream().max(Integer::compareTo).get() + 1;
        }

        if (arrayList.size() == A.length && A.length == arrayList.get(A.length - 1)) {
            return A.length;
        }
        return list.stream()
                .min(Integer::compareTo).get();

    }
}
