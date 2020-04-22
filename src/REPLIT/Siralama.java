package REPLIT;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter random 4 number 0~9");
        byte a = input.nextByte();
        byte b = input.nextByte();
        byte c = input.nextByte();
        byte d = input.nextByte();

        byte num1=0;
        byte num2=0;
        byte num3=0;
        byte num4=0;


        if (a < b && a < c && a < d) {
            num1 = a;
            if (b < c && b < d) {
                num2 = b;
                if (b < c && c < d) {
                    num3 = c;
                    num4 = d;

                } else if (b < c && d < c) {
                    num3 = d;
                    num4 = c;
                }

            } else if (c < b && c < d) {
                num2 = c;
                if (c < b && b < d) {
                    num3 = b;
                    num4 = d;

                } else if (c < b && d < b) {
                    num3 = d;
                    num4 = b;

                } else if (d < b && d < c) {
                    num2 = d;
                }
                if (d < b && b < c) {
                    num3 = b;
                    num4 = c;
                } else if (d < b && c < b) {
                    num3 = c;
                    num4 = b;
                }

            }

        }





        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);


    }
}
