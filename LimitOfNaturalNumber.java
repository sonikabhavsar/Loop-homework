import java.util.Scanner;
     // Program to check the limit of natural numbers and their sum

public class LimitOfNaturalNumber {

    public static void main(String[] args)
    {
        int i, n, sum=0;
        {
            Scanner in = new Scanner(System.in);
            //ask the user enter the number
            System.out.print("Input number: ");
            n = in.nextInt();
        }
        System.out.println("The first n natural numbers are : "+n);

        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The Sum of Natural Number up to "+n+ " terms : " +sum);

    }
}
