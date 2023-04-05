import java.util.Scanner;

     //Program for  find out the total number of 'a'  from user given in the string
public class CountTheNumberOfAFromString {

         public static void main(String[] args) {

             Scanner input =new Scanner(System.in);

             //Ask user to enter the  string
             System.out.println("Enter the string:");
             String string =input.nextLine();

             int count =0;

             for (int i = 0; i < string.length(); i++) {
                 if (string.charAt(i) == 'a'){
                     count++;
                 }

             }
             System.out.println("Total number of 'a' in the string: " + count);
         }
     }


