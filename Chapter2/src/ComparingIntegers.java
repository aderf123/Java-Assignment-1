

import java.util.Scanner;
public class ComparingIntegers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number =input.nextInt();

        if (number > 100){
            System.out.println("The number is greater than 100");
        } else if (number < 100) {
            System.out.println("The number is less than 100");
        } else {
            System.out.println("The number is  equal to 100");
        }

        // this is for the 'not equal to'
        if (number != 100) {
            System.out.println("The number is not equal to 100");
        }

        int square = number * number;


        if (square > 100){
            System.out.println("The square of the number is greater than 100");
        } else if (square < 100) {
            System.out.println("The square of the number is less than 100");
        } else {
            System.out.println("The square of the number is  equal to 100");
        }

        // this is for the 'not equal to'
        if (square != 100) {
            System.out.println("The square of the number is not equal to 100");
        }
    }
}
