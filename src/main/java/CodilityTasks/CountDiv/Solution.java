package CodilityTasks.CountDiv;

//codility score ->100%
class Solution {
    public int solution(int A, int B, int K) {

        if (A % K > 0)
            return (B - (A - A % K)) / K;
        if (A % K == 0)
            return (B - A) / K + 1;
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(6, 11, 2);
    }
}

