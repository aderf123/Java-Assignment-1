import java.util.Scanner;

public class LargeSmallInteger {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

//        int number1;
//        int number2;
//        int number3;
//        int number4;
//        int number5;

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        System.out.print("Enter fourth number: ");
        int number4 = input.nextInt();

        System.out.print("Enter fifth number: ");
        int number5 = input.nextInt();

        System.out.println();
        int smallest;
        if (number1 <= number2 && number1 <= number3 && number1 <= number4 && number1 <= number5){
            System.out.println("The smallest is: " +number1);
        } else if (number2 <= number1 && number2 <= number3 && number2 <= number4 && number2 <= number5) {
            System.out.println("The smallest is: " +number2);
        } else if (number3 <= number1 && number3 <= number2 && number3 <= number4 && number3 <= number5) {
            System.out.println("The smallest is: " +number3);
        } else if (number4 <= number1 && number4 <= number2 && number4 <= number3 && number4 <= number5) {
            System.out.println("The smallest is: " +number4);
        }else {
            System.out.println("The smallest is: " +number5);
        }


        int largest;
        if (number1 >= number2 && number1 >= number3 && number1 >= number4 && number1 >= number5){
            System.out.println("The largest is: " +number1);
        } else if (number2 >= number1 && number2 >= number3 && number2 >= number4 && number2 >= number5) {
            System.out.println("The largest is: " +number2);
        } else if (number3 >= number1 && number3 >= number2 && number3 >= number4 && number3 >= number5) {
            System.out.println("The largest is: " +number3);
        } else if (number4 >= number1 && number4 >= number2 && number4 >= number3 && number4 >= number5) {
            System.out.println("The largest is: " +number4);
        }else {
            System.out.println("The largest is: " +number5);
        }




    }

}
