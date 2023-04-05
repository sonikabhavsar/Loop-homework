import java.util.Scanner;

//Program to find the which number user enter  is prime number or not
public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //Ask the user to enter the number
        System.out.println("Enter a number:");
        int number =input.nextInt();
        int i;
        for (i =2; i<=number/2;i++){
            if (number % 1 ==0){
                //To check it's not prime number
                System.out.println( number + " is not a prime number.");
                break;
            }
        }if ((i>number/2)){
            //To check it's a prime number
            System.out.println(number + " is a prime number");
        }
    }
}
