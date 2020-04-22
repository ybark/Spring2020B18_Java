package day18_NestedLoop;

import java.util.Scanner;

public class _08_Nested_loop_Practice {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while(true) {
            System.out.println("Enter two numbers:");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers :" + (num1 + num2));
            System.out.println("do you want to continue ? :");
            String answer = input.next();
            while ( !(answer.equalsIgnoreCase("yes") ||
            answer.equalsIgnoreCase("no"))) {
                System.out.println(" Invalid Entry, please re-enter do yo want to continue");
                answer=input.next();
            }


            if (answer.equalsIgnoreCase("No")) {
                System.out.println(" Thank you for using the calculator");
                System.exit(0);
            }
        }
    }
}
