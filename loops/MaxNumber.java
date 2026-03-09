import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

 int max;
 int mini;
 int secondLargestNum;

System.out.print("Enter first number: ");
  max = input.nextInt();
  mini = max;
  secondLargestNum = mini;


 for(int i = 2; i <= 10; i++){
      System.out.print("Enter another number: ");
  int number = input.nextInt();

if (number > max) {
 max = number;
}
if (number < mini) {
 mini = number;
 }
else if (number > secondLargestNum && number != max) {
 secondLargestNum = number;
 }
   }

System.out.println("");
System.out.println("Maximum number is: " + max);

System.out.println("Minimum number is: " + mini);


System.out.println("Second largest number is: " + secondLargestNum);

input.close();


      }
}