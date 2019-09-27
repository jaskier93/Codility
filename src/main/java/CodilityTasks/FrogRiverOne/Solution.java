package CodilityTasks.FrogRiverOne;

//100% score codility
class Solution {
    public int solution(int X, int[] A) {
        boolean[] stepMap = new boolean[X+1];
        for(int i = 0; i < A.length; i++){
            if(!stepMap[A[i]]){
                stepMap[A[i]] = true;
                X--;
            }
            if(X == 0) return i;
        }
        return -1;
    }
}
