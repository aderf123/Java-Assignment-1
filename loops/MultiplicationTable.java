import java.util.Scanner;
public class MulitiplicationTable{
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");

        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Invalid Input.Please enter a postive number.");
        } else {
            for (int i= 1; i <= 12; i++) {
                System.out.println(number + "x" + i + "=" + (number * i));
            }
        }
        input.close();
    }
} 