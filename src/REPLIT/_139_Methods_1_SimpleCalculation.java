package REPLIT;

import java.util.Scanner;

public class _139_Methods_1_SimpleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        plus(a,b);
    }

    public static void plus (int num1,int num2) {

        System.out.println(num1+num2);
    }
}
