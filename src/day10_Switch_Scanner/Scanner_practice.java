package day10_Switch_Scanner;
import java.util.Scanner;

public class Scanner_practice {


    public static void main(String[] args) {
        /* Scanner input = new Scanner(System.in);
        System.out.println(" enter your first number");
        byte num = input.nextByte();
        System.out.println("enter your second number");
        byte num2 =input.nextByte();
        System.out.println("The sum of those numbers ==> " + (num+num2) );
*/

        Scanner input = new Scanner(System.in);
        System.out.println("first number");
        short num1 = input.nextShort();
        System.out.println("second number");
        short num2 = input.nextShort();
        System.out.println("toplamları "+ (num1+num2));
    }
}

