package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class _03_StringMethods {

        // toCharArray() returns String to you as a char array
        // split(str) :  divide the trings by space
    public static void main(String[] args) {

        String str = "Cybertek";

        char[] ch1 = str.toCharArray(); // [ 'C','y','b',e'r't'e'k' ]

        System.out.println(str.length() == ch1.length);

        System.out.println("---------------");

        /*
        str1 ="abc" str2 ="cab";  Are there same charactre or not
         */

        String str1 = "abc";
        String str2 = "bca";

        char[] ch2 = str1.toCharArray();
        char[] ch3 = str2.toCharArray();

        System.out.println(Arrays.equals(ch2,ch3));

        Arrays.sort(ch2);
        Arrays.sort(ch3);

        System.out.println(Arrays.equals(ch2,ch3));

        System.out.println("--------------------");

        String sentence = "I like to learn java";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        int  totalWords = words.length;
        System.out.println(totalWords);

        // java learn to like I

        String result ="";
       for (int i= words.length-1; i>=0; i--) {
           result+=words[i]+" ";
           System.out.print(words[i] + " ");

       }
        System.out.println();
        System.out.println(result.trim());







    }
}
