package CodilityTasks.SomeTasks;

//Fibonacci rekurencyjnie
public class Fibonacci {
    public static long fibonacci(int n) {
        if (n < 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(15));
        System.out.println(fibonacci(25));
        System.out.println(fibonacci(35));
    }
}

