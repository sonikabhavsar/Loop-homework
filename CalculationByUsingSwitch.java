import java.util.Scanner;

     //Program for  check numbers calculation by using the switch statement
public class CalculationByUsingSwitch {

    public static void main(String[] args) {
        char operator;
        double number1 , number2, result;

        //create an object of scanner class
        Scanner input = new Scanner(System.in);

        // ask user to enter operator
        System.out.println("Choose an operator: +, -, *, /");
        operator = input.next().charAt(0);

        // ask user to enter numbers
        System.out.println("Enter the first number");
        number1 = input.nextDouble();

        System.out.println("Enter the second number");
        number2 = input.nextDouble();

         switch (operator){
             //perform addition between numbers
             case '+':
                 result = number1 + number2;
                 System.out.println(number1 + " + " + number2 + " = " + result);
                 break;
             // performs subtraction between numbers
             case '-':
                 result = number1 - number2;
                 System.out.println(number1 + " - " + number2 + " = " + result);
                 break;
             // performs multiplication between numbers
             case '*':
                 result = number1 * number2;
                 System.out.println(number1 + " * " + number2 + " = " + result);
                 break;

             // performs division between numbers
             case '/':
                 result = number1 / number2;
                 System.out.println(number1 + " / " + number2 + " = " + result);
                 break;

             default:
                 System.out.println("Invalid operator!");
                 break;

         }
         input.close();
    }
}
