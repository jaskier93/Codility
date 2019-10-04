package CodilityTasks.PermCheck;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] A) {

    int score = 0;
    long distinctElementsCounter = Arrays.stream(A)
            .boxed()
            .distinct()
            .count();

        if(distinctElementsCounter !=A.length)

    {
        return 0;
    }

    long sum = Arrays.stream(A)
            .sum();

    List<Integer> integerList = new ArrayList<>(A.length);
        for(
    int i :A)

    {
        integerList.add(i);
    }
        Collections.sort(integerList);

    int sum2 = (integerList.get(0) + integerList.get(integerList.size() - 1)) * (integerList.size() / 2);

        if(integerList.get(integerList.size()-1)>integerList.size()||(integerList.get(0)!=1)||distinctElementsCounter<A.length)

    {
        score = 0;
    } else if(((A.length ==1&&A[0]==1)||(A.length ==2&&A[0]==1&&A[1]==2))||
            (distinctElementsCounter ==integerList.size()&&sum ==sum2 &&integerList.get(0)==1&&integerList.get(integerList.size()-1)==integerList.get(integerList.size()-1)))

    {
        score = 1;
    }
        return score;
}

    public int solutionWithSet(int[] A) {
        //TODO: both methods ->83% score
        Arrays.sort(A);

        Set<Integer> set = Arrays.stream(A).boxed().collect(Collectors.toSet());

        int setSum = set.stream().mapToInt(Integer::intValue).sum();
        int arraySum = Arrays.stream(A).sum();

        if(set.size()<A.length){
            return 0;
        }

        if (A.length > 0 && arraySum == setSum && A[0] == 1 && A[A.length - 1] == A.length) {
            return 1;
        }
        return 0;
    }
}