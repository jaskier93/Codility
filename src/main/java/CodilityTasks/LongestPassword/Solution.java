package CodilityTasks.LongestPassword;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//codility score -> 100%
class Solution {
    public int solution(String S) {

        if (S.isEmpty()) {
            return -1;
        }

        List<String> passwordList = Stream.of(S.split(" "))
                .map(passwords -> new String(passwords))
                .collect(Collectors.toList());

        int digits;
        int letters;

        for (int i = 0; i < passwordList.size(); i++) {
            digits = 0;
            letters = 0;
            for (int j = 0; j < passwordList.get(i).length(); j++) {
                if (!Character.isLetterOrDigit(passwordList.get(i).charAt(j))) {
                    passwordList.set(i, "a");
                    break;
                }
                if (Character.isDigit(passwordList.get(i).charAt(j))) {
                    digits++;
                }
                if (Character.isLetter(passwordList.get(i).charAt(j))) {
                    letters++;
                }
            }
            if ((letters + digits != passwordList.get(i).length()) || letters == 1 || letters % 2 == 1 || digits % 2 == 0) {
                passwordList.set(i, "a");
            }
        }

        if (passwordList.isEmpty() || passwordList.stream().filter(c -> c.equals("a")).count() == passwordList.size()) {
            return -1;
        }

        if (passwordList.size() == 1 && !passwordList.get(0).equals("a"))
            return passwordList.get(0).length();


        if (passwordList.size() > 1)
            return passwordList.stream()
                    .max(Comparator.comparingInt(String::length))
                    .get().length();
        return -1;
    }
}