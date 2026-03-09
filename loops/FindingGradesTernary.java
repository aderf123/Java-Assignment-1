import java.util.Scanner;

public class FindingGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int HighestScore = 0;

        System.out.println("Enter Five Different Subjects and their Scores");
        System.out.println("");

        // Loop for 5 subjects
        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Subject name: ");
            String subject = input.nextLine();

            System.out.print("Enter Score: ");
            int score = input.nextInt();
            input.nextLine(); // consume the leftover newline

            
            String grade = (score >= 70) ? "Grade A"
                        : (score >= 60) ? "Grade B"
                        : (score >= 50) ? "Grade C"
                        : "Grade D";

            System.out.println(subject + " Grade: " + grade);

          
            if (score > HighestScore) {
                HighestScore = score;
            }

            System.out.println(); 
        }

        System.out.println("Highest Score is: " + HighestScore);

        input.close();
    }
}