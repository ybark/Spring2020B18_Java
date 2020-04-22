package REPLIT;

import java.util.Scanner;

public class _069_FirstHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int lng=str.length()/2;
        String result = str.substring(0,lng);
        System.out.println(result+result);

    }
}
