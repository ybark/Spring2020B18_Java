package REPLIT;
/*
Write a for loop that prints all the even integers from 80 through
20 inclusive, separated by spaces.
MUST USE FOR EACH LOOP

 */

import java.util.Arrays;

public class _113_Array_reverseNumber_forEachLoop {
    public static void main(String[] args) {

        int[] numbers = new int[61];

        String result="";
        int count=80;
        for(int i=0;i<=60;i++) {
        numbers[i]=count;
        count--;
        }

        for (int eachnumber:numbers) {
            if (eachnumber %2 ==0) {
                result+=""+eachnumber+" ";
            }
        }
        System.out.println(result.trim());
    }

}
