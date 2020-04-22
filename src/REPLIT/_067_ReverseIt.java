package REPLIT;

import java.util.Scanner;

public class _067_ReverseIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result ="";
        int size = str.length();

        if (size>5) {
            result="Too long!";
        } else if (size<5) {
            result = "Too short!";
        } else {
            for (int i= str.length()-1;i>=0;i--) {
                result+=""+str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
