import java.util.Scanner;

     //Program to find number 3 and 5 separately divided  1 to 100 numbers
public class SeparatelyDivided {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }
    }
}
