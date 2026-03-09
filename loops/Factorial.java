import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input. Please enter a positive number.");
        } else {

            int factorial = 1; // start at 1

            for (int N = 1; N <= number; N++) {
                factorial = factorial * N;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}