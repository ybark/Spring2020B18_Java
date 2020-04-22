package day13_StringClass;

import java.util.Scanner;

public class initailOfFullName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name please :");
        String fullName = input.nextLine();
        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);
        String initial = firstName.substring(0,1).toUpperCase()+ lastName.substring(0,1).toUpperCase();

        System.out.println(initial);
    }
}
