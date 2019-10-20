package CodilityTasks.SomeTasks;

import java.util.Arrays;

public class GenomicRangeQuerry {
    public static int[] solution(String S, int[] P, int[] Q) {
        int stringLength = S.length();
        int[] genomicArray = new int[stringLength];
        char[] actgLetters = S.toCharArray();
        int[][] actgOccurency = new int[4][stringLength + 1]; //two-dimensional array, 4-> 4 letters (a,c,t,g)

        for (int i = 0; i < stringLength; i++) {
                for (int j = 0; j < 4; j++) {
                    actgOccurency[j][i + 1] = actgOccurency[j][i];
            }
            switch (actgLetters[i]) {
                case 'A':
                    actgOccurency[0][i + 1]++;
                    break;
                case 'C':
                    actgOccurency[1][i + 1]++;
                    break;
                case 'G':
                    actgOccurency[2][i + 1]++;
                    break;
                case 'T':
                    actgOccurency[3][i + 1]++;
                    break;
            }
        }
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < 4; j++) {
                if ((actgOccurency[j][Q[i] + 1] - actgOccurency[j][P[i]]) > 0) {
                    genomicArray[i] = j + 1;
                    break;
                }
            }
        }
        return Arrays.stream(genomicArray).filter(c -> c > 0).toArray();
    }
}
