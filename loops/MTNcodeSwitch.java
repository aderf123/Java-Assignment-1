import java.util.Scanner;
public class MTNcode{
    public static void main (String [] args) {

   Scanner input = new Scanner (System.in);

   System.out.print ("Enter your MTN USD code: ");
        String code = input.nextLine();


  switch (code){
 case "*312#":
 System.out.println(" 1.Data Plans");
  
case "2":
 System.out.println("2.Enjoy 4.5GB for N1000");
  
case "3":
 System.out.println("3.Enjoy 60GB for N13000");
  
case "4":
 System.out.println("4.Voice Offers");
  
case "5":
 System.out.println("5.XtraValue");
  
case "6":
 System.out.println("6.Roaming/lnt'l");
  o
case "7":
 System.out.println("7.Gift Data");
  
case "99":
 System.out.println("99.Next");
  break;
default :
 System.out.println("Not a day of the week");





}

}
}