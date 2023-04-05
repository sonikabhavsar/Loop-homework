import java.util.Scanner;

//Program for find out  the sum of x ranging from 1 to 20
public class Range {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Ask user to enter the  ant number of 1 to 20
        System.out.println("First number: ");
        int a = scanner.nextInt();

        //Ask use to enter the number <=20
        System.out.println("Second number: ");
        int b = scanner.nextInt();

        int sum = 0;

        for (int x = a; x <= b; x++)
            sum = sum += x;
        System.out.println ("The sum of x ranging from 1 to 20 is : " + sum);
    }
}
