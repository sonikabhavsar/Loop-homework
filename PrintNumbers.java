import java.util.Scanner;

// Program for print any 10 number between given/user input range
public class PrintNumbers {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

    //Ask user to enter the first number
        System.out.println("Enter input any first number");{
            int number1 =scanner.nextInt();

            //Ask user to enter the last number
            System.out.println("Enter input any last number");
            int number2 =scanner.nextInt();

            for (number1=number1; number1<=number2; number1++) {
                System.out.println(number1);

            }
        }


}
    }

