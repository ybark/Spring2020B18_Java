package REPLIT;

import java.util.Scanner;

public class happyValley {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();
        if (age<2) {
            System.out.println("ineligible");
        } else if(age ==2) {
            System.out.println("toddler");
        } else if(age >2 && age <6) {
            System.out.println("early childhood");
        } else if(age >5 && age <8) {
            System.out.println("younger reader");
        } else if(age >7 && age <11) {
            System.out.println("elementary");
        } else if(age==11 || age ==12) {
            System.out.println("middle");
        } else if(age ==13) {
            System.out.println("impossible");
        } else if(age >13 && age <17) {
            System.out.println("high school");
        } else if(age >16 && age <19) {
        System.out.println("scholar");
        } else if(age >18) {
            System.out.println("inelligible");
        }
    }
}
