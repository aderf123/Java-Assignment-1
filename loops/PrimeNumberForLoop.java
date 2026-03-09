import java.util.Scanner;

public class PrimeNumberForLoop {
    public static void main(String[] args) {

     num <= 50;

        // Input validation using for loop
        for (; number <= 0; ) {
            System.out.print("Enter a positive number: ");
            number = input.nextInt();

            if (number <= 0) {
                System.out.println("Invalid input. Try again.");
            }
        }

        if (number == 1) {
            System.out.println("Number is not prime.");
        } else {

            boolean isPrime = true;

            // Prime check using for loop
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Number is prime.");
            } else {
                System.out.println("Number is not prime.");
            }
        }

        input.close();
    }
}