
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Is Prime: " + PrimeOperations.isPrime(n));
        System.out.print("Fibonacci: ");
        FibonacciOperations.fibonacci(n);
        System.out.println("Factorial: " + FactorialOperations.factorial(n));

        sc.close();
    }
}

