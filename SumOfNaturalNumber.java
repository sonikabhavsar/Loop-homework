import java.util.Scanner;

//program for check the sum of natural number which user entered
public class SumOfNaturalNumber {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        //Ask user to enter the number
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int i,sum=0;

        for(i=0;i<=n;i++)
        {
            sum = sum + i;
        }

        System.out.println("Sum of first "+n+" natural number = "+sum);
    }
}


