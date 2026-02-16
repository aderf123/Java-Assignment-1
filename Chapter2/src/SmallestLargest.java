import java.util.Scanner;

public class SmallestLargest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        //      int number1;
        //      int number2;
        //      int number3;

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int average = sum /3;
        int product = number1 * number2 * number3;


        System.out.println("The Sum of numbers are: " + sum);
        System.out.println("The Average of the numbers are: " + average);
        System.out.println("The Product of numbers are: " + product);



        int smallest;
        if (number1 <= number2 && number1 <= number3){
            System.out.println("The smallest is: " +number1);
        } else if (number2 <= number1 && number2 <= number3) {
            System.out.println("The smallest is: " +number2);
        }else {
            System.out.println("The smallest is: " +number3);
        }

        int largest;
        if (number1 >= number2 && number1 >= number3){
            System.out.println("The largest is: " +number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The largest is: " +number2);
        }else {
            System.out.println("The largest is: " +number3);
        }


    }
}
