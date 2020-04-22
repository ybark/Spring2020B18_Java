package REPLIT;

import java.util.Scanner;

public class _57_FindaUser {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String input = scan.nextLine();
        String user1 = "Max Payne";
        String user2 = "Alan Wake";
        if (input.equalsIgnoreCase(user1) || input.equalsIgnoreCase(user2)) {
            System.out.println("User found!");
        } else {
            System.out.println("User not found!");
        }


    }
}
