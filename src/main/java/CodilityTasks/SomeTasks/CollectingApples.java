package CodilityTasks.SomeTasks;

import java.util.*;

class CollectingApples {
    public static int solution(int[] A, int K, int L) {
        if (K + L > A.length)
            return -1;

        int tempSum;
        int applesColletedByAlice;
        int applesColletedByBob;
        int sumOfApples = 0;

        HashMap<Integer, Integer> aliceWorkspace = new HashMap<>();
        HashMap<Integer, Integer> bobWorkspace = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            tempSum = 0;
            if (K + i > A.length)
                break;
            for (int j = i; j < K + i; j++) {
                tempSum += A[j];
            }
            aliceWorkspace.put(i, tempSum);
        }

        for (int i = 0; i < A.length; i++) {
            tempSum = 0;
            if (L + i > A.length)
                break;
            for (int j = i; j < L + i; j++) {
                tempSum += A[j];
            }
            bobWorkspace.put(i, tempSum);
        }

        for (Map.Entry<Integer, Integer> aliceWorkspaceMap : aliceWorkspace.entrySet()) {
            applesColletedByBob = 0;
            applesColletedByAlice = aliceWorkspaceMap.getValue();
            if (aliceWorkspaceMap.getKey() < bobWorkspace.size() - K) {
                for (int i = aliceWorkspaceMap.getKey() + K; i < bobWorkspace.size(); i++) {
                    if (bobWorkspace.get(i) > applesColletedByBob)
                        applesColletedByBob = bobWorkspace.get(i);
                }
                if (sumOfApples < applesColletedByAlice + applesColletedByBob)
                    sumOfApples = applesColletedByAlice + applesColletedByBob;
            }
        }
        return sumOfApples;
    }

    public static void main(String[] args) {
        System.out.println("--- total collected apples: " + solution(new int[]{6, 1, 4, 6, 3, 2, 7, 4}, 3, 2));
        System.out.println("--- total collected apples: " + solution(new int[]{10, 19, 15}, 2, 2));
        System.out.println("--- total collected apples: " + solution(new int[]{6, 1, 4, 3, 11}, 2, 3));
    }
}