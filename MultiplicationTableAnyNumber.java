import java.util.Scanner;

    // Program to check Multiplication table for any numbers which user enter
public class MultiplicationTableAnyNumber {

    //To check Multiplication table for use any numbers
    public static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);
        //Ask user to enter the number
        System.out.print("Enter number: ");
   //reading a number whose table is to be print
        int num=scanner.nextInt();
    //loop start execution form and execute until the condition i<=12 becomes false
        for(int i=1; i <= 12; i++)
        {
   //prints table of the entered number
            System.out.println(num+" * "+ i +" = " + num*i);
        }
    }
}
