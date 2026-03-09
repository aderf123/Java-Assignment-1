import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input. Please enter a positive number.");
        } else {

            int i = 1; // initialization

            while (i <= 12) { // condition
                System.out.println(number + " x " + i + " = " + (number * i));
                i++; // Update
            }

        }

        input.close();
    }
}