import java.util.Scanner;
  //Program to check the user enter number come to reversedNumber using the loop
//use main method
public class ReverseTheNumbers {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int number = input.nextInt();
        int reversedNumber =0;

        for (; number !=0; number/=10) {
            int digit =number % 10;
            reversedNumber =reversedNumber *10 + digit;
            
        }
        System.out.println("Reverses number: " + reversedNumber);
    }
}
