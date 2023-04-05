import java.util.Scanner;
   //Program  to check the value of number in factorialNumber
public class FactorialOfNumbers {
    public static void main(String[] args)
    {
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();   //Input the number
        if(num>=0)
        {
            //Call a recursive function to find the factorial
            int factorial=findFactorial(num);
            System.out.println("The factorial of the entered number is :"+factorial);
        }
        else
        {
            System.out.println("Factorial not possible.");
            System.out.println("Please enter valid input.");
        }
    }
    //Recursive Function to Find the Factorial of a Number
    public static int findFactorial(int num)
    {
        if(num==0)
            return 1;
        else if(num==1)
            return 1;
        else
            return num*findFactorial(num-1);
    }
}


