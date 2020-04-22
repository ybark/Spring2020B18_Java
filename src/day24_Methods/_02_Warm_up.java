package day24_Methods;

import java.util.Scanner;

public class _02_Warm_up {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        max(a,b);
        Calculation(a,b,'*');
        palindrome("Anna");

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enger number 1 : ");
            int num1 = scan.nextInt();
            System.out.println("enter number 2 : ");
            int num2 = scan.nextInt();
            System.out.println("Enter operator : ");
            char operator = scan.next().charAt(0);

            Calculation(num1, num2, operator);

            System.out.println(" do yo want to continue :");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ){
                System.out.println("invalid Entry");
                System.out.println(" do you want to continue :" );
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }

        }




    }

    public static void max(int num1, int num2  ){

        if (num1 >= num2) {
            System.out.println("Maximum number is: " +num1);
        } else {
            System.out.println("Maximum number is: " +num2);
        }
    }

    public static void Calculation (double num1, double num2,char operator) {

        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            case'%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid");


        }
    }

    public static void palindrome(String str) {
        str=str.toLowerCase();
        String reversed="";

        for (int i=str.length()-1;i>=0;i--) {
            reversed+=str.charAt(i);
        }
        System.out.println(str.equals(reversed));

    }
}


