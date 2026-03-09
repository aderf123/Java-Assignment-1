import java.util.Scanner;

public class PrimeNumberWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validation
        while (number <= 0) {
            System.out.println("Invalid input. Enter a positive number:");
            number = input.nextInt();
        }

        if (number == 1) {
            System.out.println("Number is not prime.");
        } else {

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;  // stop checking once divisor is found
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