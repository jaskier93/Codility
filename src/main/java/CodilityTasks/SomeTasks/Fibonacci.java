package CodilityTasks.SomeTasks;

//Fibonacci rekurencyjnie
public class Fibonacci {
    public static double fibonacci(int n) {
        if (n < 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(15));
        System.out.println(fibonacci(25));
        System.out.println(fibonacci(38));

        System.out.println("Double max value = " + Double.MAX_VALUE);
    }
}

