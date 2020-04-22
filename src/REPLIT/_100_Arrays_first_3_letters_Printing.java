package REPLIT;

import java.util.Scanner;

public class _100_Arrays_first_3_letters_Printing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr[] = new String[5];
        for (int i=0;i<5;i++) {
            arr[i] = input.next();

        }

        for (int i=0;i<5;i++) {
           String asd= arr[i];
            System.out.println(arr[i].substring(0,3));
        }

    }

}
