package day16_forLoop;


import java.util.Scanner;

public class _5_CalculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a number :");
        int num = input.nextInt();

        int sum =0;
        for (int i = 1; i<=num; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
