package CodilityTasks.BinaryGap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int N) {

        String binaryNumber = Integer.toBinaryString(N);
        int biggestGap = 0;
        int temp = 0;
        Integer value;
        List<Integer> integerList = Arrays.stream(binaryNumber.split("")).map(Integer::parseInt).collect(Collectors.toList());

        if (integerList.stream().filter(c -> c == 1).count() == 1) {
            return 0;
        } else {

            for (int i = 0; i < integerList.size(); i++) {
                value = integerList.get(i);
                {
                    if (value == 0) {
                        temp++;
                        if (temp >= biggestGap) {
                            biggestGap = temp;
                        }
                    } else if (value == 1) {
                        temp = 0;
                    }
                }
            }
            System.out.println(biggestGap);
            return biggestGap;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(1041);
        solution.solution(10451);
        solution.solution(104547751);
    }
}
