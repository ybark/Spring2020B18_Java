package REPLIT;
import java.util.Scanner;
public class Number3Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int sum = num1+num2+num3;
        System.out.println("Sum of 3 number is:"+sum);

    }
}
