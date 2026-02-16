import java.util.Scanner;

public class DivisibleBy3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

//        int number;

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Number Picked is: " + number);
        System.out.println();

        if (number % 3 == 0){
            System.out.println("Number is Divisible by 3");
    } else {
            System.out.println("Number is not Divisible by 3");
        }
}
}
