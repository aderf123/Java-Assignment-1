import java.util.Scanner;

public class Cicrle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

//          int R;

        System.out.print("Enter the Radius: ");
        int R = input.nextInt();


        double pie = 3.14;
        int diameter = 2 * R;
        double Circumference = 2 * pie * R;
        double area = pie * R * R;

        System.out.println("When pie = " + pie);
        System.out.println("And Radius = " + R);
        System.out.println();
        System.out.println("The Diameter of a Circle is: " + diameter);
        System.out.println("The Circumference of a Circle is: " + Circumference);
        System.out.println("The Area of a Circle is: " + area);








    }
}
