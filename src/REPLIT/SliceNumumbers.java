package REPLIT;

import java.util.Scanner;

public class SliceNumumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = input.nextInt();
        int tenThousand =  number/10000;
        int thousand = (number-(tenThousand*10000))/1000;
        int hundred = (number - ((10000*tenThousand)+(1000*thousand)))/100;
        int ten = (number - ((10000*tenThousand)+ (1000*thousand)+(hundred*100)))/10;
        int one = number -(
                (10000*tenThousand)+ (1000*thousand)+ (hundred*100) + (ten*10));
        System.out.println(tenThousand);
        System.out.println(thousand);
        System.out.println(hundred);
        System.out.println(ten);
        System.out.println(one);

    }
}
