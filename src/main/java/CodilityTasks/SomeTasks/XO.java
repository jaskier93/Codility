package CodilityTasks.SomeTasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Task: Check to see if a string has the same amount of 'x's and 'o's.
// The method must return a boolean and be case insensitive.
// The string can contain any char.
public class XO {
    public static boolean getXO(String str) {

        if (str.length() < 2)
            return false;

        str.toLowerCase();
        List<String> letters = Arrays.stream(str.split("")).collect(Collectors.toList());

        int x = (int) letters.stream().filter(c -> c.equals("x")).count();
        int o = (int) letters.stream().filter(c -> c.equals("o")).count();
        if (x == o)
            return true;
        return false;
    }

    public static void main(String[] args) {

        System.out.println(getXO("XxxxooO"));
        System.out.println(getXO("zssddd"));
        System.out.println(getXO("Xxxxertr34"));
        System.out.println(getXO("xxxooo"));
        System.out.println(getXO("xxxXooOo"));
    }
}