package Z_SELFSTUDY;

import java.util.Scanner;

public class _03_30_True_False {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();

        if (word.charAt(0)== word.charAt(word.length()-1)) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }


    }
}
