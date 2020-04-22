package day16_forLoop;

import java.util.Scanner;

public class _01_PalindromeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word :");
        String word = input.nextLine();
            String reversedWord = "";

            for (int i= word.length()-1;i>=0;i--) {
                reversedWord +=word.charAt(i);
            }
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println(reversedWord);
            System.out.println("Tru");
        } else {
            System.out.println(reversedWord);
        System.out.println("False");}


    }
}
