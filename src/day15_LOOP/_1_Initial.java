package day15_LOOP;

import java.util.Scanner;

/*
1. write a program that asks user's first and last name, then prints out the initials of the user
            Ex:
                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
 */
public class _1_Initial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            System.out.println("Enter your first name");
            String firstName  =  scan.next();

            System.out.println("Enter your last name");
            String lastName  =  scan.next();

          /*
            String initials = firstName.substring(0,1).toUpperCase() +  lastName.substring(0,1).toUpperCase();
             //    initials = initials.toUpperCase();
        */

            String initials = "" + firstName.charAt(0) + lastName.charAt(0);  // returns string

            initials = initials.toUpperCase();
            System.out.println(initials);

    }
}
