package CodilityTasks.CountFactors;

class Solution {
    public int solution(int N) {

        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        if (N == 2) {
            return 2;
        }
        int counter = 0;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                counter++;
            }
        }
        //Counter + 2, because  N is always divisible by itself and 1 (if N>1)
        return counter + 2;
    }
}
