package CodilityTasks.PassingCars;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

        //TODO: zoptymalizować algorytm, podwójna pętla wykonuje się zbyt długo (złożoność O(N^2)) dla tablic o dużych rozmiarach (A.length>1000)

        if (Arrays.stream(A).distinct().count() == 1) {
            return 0;
        }
        int score = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                for (int j = 1; j < A.length; j++) {
                    if (A[j] == 1 && j > i) {
                        score++;
                    }
                }
            }
        }
        if (score < 1_000_001) {
            return score;
        }
        return -1;
    }

    // codility score ->100%
    public int moreEfficientSolution(int[] A) {
        int zerosCounter = 0;
        int score = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                zerosCounter++;
            if (A[i] == 1)
                score = score + zerosCounter;
            if (score > 1000000000)
                return -1;
        }
        return score;
    }
}