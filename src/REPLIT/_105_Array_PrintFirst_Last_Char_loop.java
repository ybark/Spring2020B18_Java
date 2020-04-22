package REPLIT;


import java.util.*;
public class _105_Array_PrintFirst_Last_Char_loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        String t="";
        for (int y= 0;y<=words.length-1;y++) {
            words[y] = words[y].charAt(0) + "" + words[y].charAt(words[y].length() - 1);

        }

        System.out.println(Arrays.toString(words));

    }





    }

