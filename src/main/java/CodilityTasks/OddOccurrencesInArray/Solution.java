package CodilityTasks.OddOccurrencesInArray;

//using XOR -> codility score = 100%
class Solution {
    public int solution(int[] A) {

        int result = A[0];
        for (int i = 1; i < A.length; i++)
            result = result ^ A[i];

        return result;

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 2, 3, 3, 3, 4, 1, 2, 3, 6, 6};
        int[] array2 = {44, 3, 3, 5, 5, 7, 3, 4, 8, 8};
        int[] array3 = {1, 3, 1, 5, 2, 3, 3, 5, 5, 7, 3, 4, 8, 8};
        solution.solution(array);
        solution.solution(array2);
        solution.solution(array3);
        System.out.println("Wynik = " + solution.solution(array));
        System.out.println("Wynik = " + solution.solution(array2));
        System.out.println("Wynik = " + solution.solution(array3));
    }
}