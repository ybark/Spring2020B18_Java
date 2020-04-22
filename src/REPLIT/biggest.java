package REPLIT;

import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number 1");
        int n1 = s.nextInt();
        System.out.println("enter number 2");
        int n2 = s.nextInt();
        System.out.println("enter number 3");
        int n3 = s.nextInt();
        boolean n1greater = n1>n2 && n1>n3;
        boolean n2greater = n2>n1 && n2>n3;
        boolean n3greater = n3>n1 && n3>n2;

        if (n1greater) {
            System.out.println("n1 is bigger");
        } else if(n2greater) {
            System.out.println("n2 is bigger");
        } else if(n3greater) {
            System.out.println("n3 is bigger");
        }
    }
}
