
import java.util.Scanner;
public class LoginSystem {
    public static void main (String [] args) {

        Scanner input = new Scanner (System.in);

        String correctUsername = "admin";
        String correctPassword = "P@ss1234";

        System.out.print ("Enter Username: ");
        String username = input.nextLine();

        System.out.print ("Enter Password: ");
        String Password = input.nextLine ();

// Username Rules
        Character FirstLetter = username.charAt(0);
        if (username.length() < 5 || username.length() > 15){
            System.out.println("Username must be 5-15 characters");
            if (Character.isDigit (FirstLetter)) {
                System.out.println("Username cannot start with a number");
            }
        }

//Password Rules
        if   (Password.length() < 8){
            System.out.println("Password must be at least 8 characters");

            if (!Password.matches(".*[A-Z].*")){
                System.out.println("Password must contain at least 1 uppercase letter");
            }
        }



//Final part
        if (!username.equals(correctUsername)){
            System.out.println("Username not Found");
        } else if (!Password.equals(correctPassword)){
            System.out.println(" Incorrect password");
        }else {
            System.out.println("Login Successful");
        }

    }
}