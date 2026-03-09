import java.util.Scanner;
public class EvenOddNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int number = input.nextInt();

       String result = (number %2 == 0) ? "EvenNumber" : "OddNumber";
          System.out.println("result:" + result);

    }

}