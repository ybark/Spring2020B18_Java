package REPLIT;

import java.util.Scanner;

public class _101_Array_Print_First_Last_Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i=0;i<5;i++) {
            words[i]= input.next();
        }

        for (int i=0;i<5;i++) {
            System.out.println(words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1));
        }
    }
}
