package CodilityTasks.SomeTasks;

/*Treść zadania:
Dla liczb od 1 do 100 wypisz:
-jeżeli liczba jest podzielna przez 3 to wypisz Fizz
-jeżeli podzielna przez 5 to Buzz
-jeżeli podzielna przez 3 i 5 to wypisz FizzBuzz
-w pozostałych przypadkach wypisz liczbę.*/
public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0 && i % 5 != 0)
                System.out.println("Fizz");
            else if (i % 3 != 0 && i % 5 == 0)
                System.out.println("Buzz");
            else System.out.println("Liczba nie podzielna przez 3 i 5 wynosi: " + i);
        }
    }
}
