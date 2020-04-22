package REPLIT;

import java.util.Scanner;

public class NameLastname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" enter your first name :");
        String firstName = input.next();
        System.out.println(" Enter your last name :");
        String lastName= input.next();

        System.out.println("your full name is :" + firstName+" " + lastName);

    }
}
