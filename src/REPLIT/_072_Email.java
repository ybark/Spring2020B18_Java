package REPLIT;

import java.util.Scanner;

public class _072_Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String name ="";
        String surname ="";
        if (!email.contains("@")) {
            System.out.println("invalid entry");
        } else if (email.contains("_")) {
            int a = email.indexOf("_");
            int b = email.indexOf("@");
            name = email.substring(0, a);
            surname = email.substring(a + 1, b);

            System.out.println(surname + "_" + name + "@gmail.com");
        } else {
            System.out.println(email);
        }


    }
}
