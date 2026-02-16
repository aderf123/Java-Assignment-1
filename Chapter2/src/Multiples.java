

import java.util.Scanner;
public class Multiples {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

//       int number1;
//       int number2;

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();


        int NumberTripled = number1 * 3;
        int NumberDoubled = number2 * 2;

        System.out.println("Number Tripled: " + NumberTripled);
        System.out.println("Number Double: " + NumberDoubled);
        System.out.println();


        if (NumberTripled % NumberDoubled == 0 ) {
            System.out.println("It is a Multiple");
        } else{
            System.out.println("It is not a Multiple");
        }







    }
}
