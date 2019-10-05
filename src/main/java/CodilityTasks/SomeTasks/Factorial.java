package CodilityTasks.SomeTasks;

//silnia rekurencyjnie
public class Factorial {
    public static long factorial(int number) {
        if (number <= 2) {
            return number;
        }
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(11));
        System.out.println(factorial(15));
        System.out.println(factorial(20));
        System.out.println("Maksymalna wartość dla typu Long = " + Long.MAX_VALUE);
        System.out.println("Maksymalna liczba, dla której można obliczyć silnie (dla typu Long) wynosi 20");
    }
}
