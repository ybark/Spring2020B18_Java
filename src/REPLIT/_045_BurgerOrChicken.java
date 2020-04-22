package REPLIT;

import java.util.Scanner;

public class _045_BurgerOrChicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        float price = 0;
        String in = s.next();


        if (in.equals("burger") || in.equals("chicken")) {
            price = 10;
        } else { price =2;
        }
        System.out.println(price);


    }
}
