package CodilityTasks.ChocolatesByNumbers;

import java.util.Arrays;

public class Solution {
    public int solution(int N, int M) {

        //TODO: do poprawki (50%) -> spróbować rekurencji z obliczeniem liczby dzielników lub wspólnych wielokrotności

        if (M>N){
            M=M%N;
        }

        if (M % N == 0) {
            return 1;
        }

        int[] wrappers = new int[N];
        wrappers[0] = 1;

        int x = M;

        while (wrappers[x] ==0){
            wrappers[x] = 1;
            x = x + M;
            if (x >= N) {
                x = x % N;
            }
        }
        return (int) Arrays.stream(wrappers).filter(c -> c == 1).count();
    }
}