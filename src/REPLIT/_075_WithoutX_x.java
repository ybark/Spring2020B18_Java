package REPLIT;

import java.util.Scanner;

public class _075_WithoutX_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String newWord ="";

        if (word.startsWith("x") || word.startsWith("X")) {
            newWord =""+word.substring(1);
             if (word.endsWith("x") || word.endsWith("X")) {
            newWord= word.substring(1,word.length()-1); }

        } else if (word.endsWith("x") || word.endsWith("X")) {
            newWord= word.substring(0,word.length()-1);
        } else {
            newWord = word;}

        System.out.println(newWord);
        }




    }

