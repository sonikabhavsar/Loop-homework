import java.util.Scanner;

//Program to Check sequence of FibonacciNumbers
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = 0;
        int previousNumber = 0;
        int nextNumber = 1;

        //Ask the user to enter the number
        System.out.println("How many numbers you want in Fibonacci:");

        minNumber = scanner.nextInt();

        System.out.println("Fibonacci Series of " + minNumber + " numbers:");

        for (int i = 1; i <= minNumber; ++i) {
            System.out.println(previousNumber + " ");
            //On each iteration, we are assigning second number
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;


        }
    }
}