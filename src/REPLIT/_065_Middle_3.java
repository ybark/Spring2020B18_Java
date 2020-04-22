package REPLIT;

import java.util.Scanner;

public class _065_Middle_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = sc.nextLine();
        int result = word.length();
        boolean odd = word.length() %2 !=0 ;
        String newWord="";

        if (odd && result >=5) {
            newWord= word.substring((result/2)-1,(result/2)+1);
            System.out.println(word + " ==> " + newWord);
        } else {
            System.out.println("invalid");
        }

    }
}