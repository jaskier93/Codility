package CodilityTasks.MinPerimeterRectangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int N) {

        if (N > 1) {

            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    break;
                } else {
                    return 2 * (N + 1);
                }
            }

            if (N % 100 == 0) {
                return 4 * (int) Math.sqrt(N);
            }

            List<Integer> perimeterList = new ArrayList<>();
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    perimeterList.add(2 * (N / i + i));
                }
            }
            return perimeterList.stream().min(Integer::compareTo).get();
        }
        return 4;
    }
}