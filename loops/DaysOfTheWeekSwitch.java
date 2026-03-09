import java.util.Scanner;
public class DaysOfTheWeek{
    public static void main (String [] args) {

   Scanner input = new Scanner (System.in);

   System.out.print ("Enter a day of the week: ");
        String day = input.nextLine();


  switch (day){
 case "Monday":
 System.out.println("it is the first working day of the week");
  break;
case "Tuesday":
 System.out.println("it is the second working day of the week");
  break;
case "Wednesday":
 System.out.println("it is the third working day of the week");
  break;
case "Thursday":
 System.out.println("it is the forth working day of the week");
  break;
case "Friday":
 System.out.println("it is the fifth working day of the week");
  break;
case "Saturday":
 System.out.println("welcome to the weekend");
  break;
case "Sunday":
 System.out.println("keep the sabbath day holy");
  break;
default :
 System.out.println("Not a day of the week");
}




}
}