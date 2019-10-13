package CodilityTasks.SomeTasks;

public class NWD {
    public static int nwd(int x, int y) {
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(nwd(35, 48));
        System.out.println(nwd(45, 69));
        System.out.println(nwd(35345, 38750));
        System.out.println(nwd(345, 285));
    }
}
