package REPLIT;

import java.util.Scanner;

public class _061_LongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        if(word1.length()>word2.length()) {
            System.out.println(word1);
        } else System.out.println(word2);
        System.out.println(word1.charAt(0)+""+word1.charAt(word1.length()-1));



    }
}
