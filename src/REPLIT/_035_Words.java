package REPLIT;

import java.util.Scanner;

public class _035_Words {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1= s.next();
        String word2 = s.next();

        if (word1.equals(word2)) {
            System.out.println("word1 equals word2");
        } else {
            System.out.println("word1 does bot equal word2");
        }
    }
}
