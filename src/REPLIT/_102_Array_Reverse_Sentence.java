package REPLIT;

import java.util.Scanner;

public class _102_Array_Reverse_Sentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       String str = sc.nextLine();

        String[] arr = str.split(" ");



        for (int i=arr.length-1;i>=0;i--) {
            System.out.println(arr[i]);
        }
    }
}
