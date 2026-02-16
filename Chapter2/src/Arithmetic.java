

import java.util.Scanner;
public class Arithmetic {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

//      int number1;
//      int number2;

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int square1 = number1 * number1;
        int square2 = number2 * number2;

        int SumOfSquares = square1 + square2;
        int DifferenceOfSquare = square1 - square2;

        System.out.println("Square of the first number: " + square1);
        System.out.println("Square of the second number: " + square2);
        System.out.println("Sum of both squares: " + SumOfSquares);
        System.out.println("Difference of their squares: " + DifferenceOfSquare);
    }
}
