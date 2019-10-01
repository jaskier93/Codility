package CodilityTasks.StrSymmetryPoint;

class Solution {
    //TODO: 71%
    public int solution(String S) {

        if (S.length() % 2 == 0 || S.isEmpty() || (S.length() > 1 && !(S.charAt(0) == S.charAt(S.length() - 1)))) {
            return -1;
        }
        if (S.length() == 1) {
            return 0;
        }

        if (S.length() > 1) {
            int temp = 0;
            for (int i = 0; i < S.length() / 2; i++) {
                if (S.charAt(i) == S.charAt(S.length() - i - 1)) {
                    temp++;
                } else
                    break;
            }
            return temp;
        }
        return 0;
    }
}