package REPLIT;

import java.util.Scanner;

public class _103_Arrays_Reversed_Sentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String words[] = sentence.split(" ");
        String reversed = "";

        for (int i=words.length-1;i>=0;i--) {
            reversed+=" "+words[i];

        }




        //End your code here. do not modify below statement
        System.out.println(reversed.trim());

    }
}
