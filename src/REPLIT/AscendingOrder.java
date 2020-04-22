package REPLIT;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter random 4 number 0~9");
        byte num1 = input.nextByte();
        byte num2 = input.nextByte();
        byte num3 = input.nextByte();
        byte num4 = input.nextByte();

        byte snum1=0;
        byte snum2=0;
        byte snum3=0;
        byte snum4=0;


        if (num1 < num2 && num1 < num3 && num1 < num4) {
            snum1 = num1;
            if (num2 < num3 && num2 < num4) {
                snum2 = num2;
                if (num3 < num4) {
                    snum3 = num3;
                    snum4 = num4;
                }
            } else if (num3<num2 && num3<num4){
                snum2=num3;
                if (num2 < num4) {
                    snum3 = num2;
                    snum4 = num4;
                }
            }else if (num4<num2 && num4<num3) {
                snum2 = num4;
                if (num2 < num3) {
                    snum3 = num2;
                    snum4 = num3;
                }
            }


        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            snum1 = num1;
            if (num1 < num3 && num1 < num4) {
                snum2 = num1;
                if (num3 < num4) {
                    snum3 = num3;
                    snum4 = num4;
                }
            }
        } else if (num3 < num1 && num3 < num2 && num3 < num4) {
            snum1 = num3;
            if (num1 < num2 && num1 < num4) {
                snum2 = num1;
                if (num2 < num4) {
                    snum3 = num2;
                    snum4 = num4;
                }
            }
        }



        System.out.println(snum1);
        System.out.println(snum2);
        System.out.println(snum3);
        System.out.println(snum4);


    }
}
