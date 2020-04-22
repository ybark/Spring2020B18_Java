package REPLIT;

import java.util.Scanner;

public class _060_LastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word.substring(word.length()-1));
    }
}
