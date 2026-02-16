

import java.util.Scanner;

public class  NegativePositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int num1;
//        int num2;
//        int num3;
//        int num4;
//        int num5;

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        System.out.print("Enter fourth number: ");
        int num4 = input.nextInt();

        System.out.print("Enter fifth number: ");
        int num5 = input.nextInt();


        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        if (num1 > 0){
            System.out.println("it is positives");
        } else if (num1 < 0) {
            System.out.println("it is negatives");
        }else {
            System.out.println("it is Zero");
        }

        if (num2 > 0){
            System.out.println("it is positives");
        } else if (num2 < 0) {
            System.out.println("it is negatives");
        }else {
            System.out.println("it is Zero");
        }

        if (num3 > 0){
            System.out.println("it is positives");
        } else if (num3 < 0) {
            System.out.println("it is negatives");
        }else {
            System.out.println("it is Zero");
        }

        if (num4 > 0){
            System.out.println("it is positives");
        } else if (num4 < 0) {
            System.out.println("it is negatives");
        }else {
            System.out.println("it is Zero");
        }

        if (num5 > 0){
            System.out.println("it is positives");
        } else if (num5 < 0) {
            System.out.println("it is negatives");
        }else {
            System.out.println("it is Zero");
        }



        System.out.println("Number of positive numbers: " + positives);
        System.out.println("Number of negative numbers: " + negatives);
        System.out.println("Number of zeros: " + zeros);
    }
}
