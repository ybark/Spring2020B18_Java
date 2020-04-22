package REPLIT;

import java.util.Scanner;

public class _95_GetSandwich_String_loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int a= 0;
        int b= 0;
        if (str.contains("bread")){
            a=str.indexOf("bread");
            b=str.lastIndexOf("bread");

        }
        if (a==b) {
            System.out.println("nothing");
        } else {
            System.out.println(str.substring(a+5,b));
        }



    }
}
