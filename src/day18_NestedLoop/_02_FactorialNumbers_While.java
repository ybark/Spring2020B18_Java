package day18_NestedLoop;

import java.util.Scanner;

public class _02_FactorialNumbers_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int result =1;
        while (num>=1) {
          result*=num;

            num--;
        }
        System.out.println(result);
    }
}
