/*



-build summary variable by concatenating subject names and grades
calculate average score and define that value into average variable.

-Display prompt: "Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4"
-Display prompt: "Your average score is: 4.36"
-Display prompt: "Thank you for using Grader!"
-Display prompt: "Goodbye!"
 */




package REPLIT;

import java.util.Scanner;

public class schoolGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println(
                "Please enter subject name number 1 and score for this subject");
        String subject1 = scan.nextLine();
        double grade1 = scan.nextDouble();
        scan.nextLine();

        System.out.println(
                "Please enter subject name number 2 and score for this subject");
        String subject2 = scan.nextLine();
        double grade2 = scan.nextDouble();
        scan.nextLine();

        System.out.println(
                "Please enter subject name number 3 and score for this subject");
        String subject3 = scan.nextLine();
        double grade3 = scan.nextDouble();
        scan.nextLine();

        System.out.println(
                "Please enter subject name number 4 and score for this subject");
        String subject4 = scan.nextLine();
        double grade4 = scan.nextDouble();
        scan.nextLine();

        System.out.println(
                "Please enter subject name number 5 and score for this subject");
        String subject5 = scan.nextLine();
        double grade5 = scan.nextDouble();
        scan.nextLine();

        System.out.println(
                "Please enter subject name number 6 and score for this subject");
        String subject6 = scan.nextLine();
        double grade6 = scan.nextDouble();
        scan.nextLine();

        double average = (grade1+grade2+grade3+grade4+grade5+grade6)/6;
        String summary =
                "Summary: "
                        + subject1 + " - " + grade1 +", "
                        + subject2 + " - " + grade2 +", "
                        + subject3 + " - " + grade3 +", "
                        + subject4 + " - " + grade4 +", "
                        + subject5 + " - " + grade5 +", "
                        + subject6 + " - " + grade6 +", ";
        System.out.println(summary);
        System.out.println("Your average score is: " + average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");





    }
}
