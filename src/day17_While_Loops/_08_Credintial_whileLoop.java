package day17_While_Loops;

import java.util.Scanner;

public class _08_Credintial_whileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name :");
        String username = input.next();

        System.out.println("Enter pasword : ");
        String password = input.next();

        boolean valid = username.equals("cybertek") && password.equals("cybertek123");

            int count = 1;
        // while (!(username.equals("cybertek") && password.equals("cybertek123"))) {
            while (! valid) { // yukaridaki ile ayni sadece boolean ile degiskene atamis olduk
            System.out.println("Please re-enter Credential" );

            System.out.println("Enter User Name : ");
            username = input.next();

            System.out.println(" Enter Password : ");
            password = input.next();

            valid = username.equals("cybertek") && password.equals("cybertek123");
                // 2. defa data girildiginden valid surekli yenilenmek zorunda zira
                // Java her girisi birbirinden farkli olarak algiliyor..

            count ++;
            if (count==3 && !valid) {
                System.out.println(" your account is locked");
                break;
            }


        }
        if (valid) {
            System.out.println("logged in");
        }

    }
}
