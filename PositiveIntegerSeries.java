import java.util.Scanner;

     //Program to find sum of  1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
public class PositiveIntegerSeries {

    public static void main(String[] args)
    { Scanner input = new Scanner(System.in);

        // Enter the positive integer by user

        System.out.println("Enter a positive integer: ");
        int n = input.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/ i;

        }
        System.out.println( "The sum of the series is " + sum);
    }
}
