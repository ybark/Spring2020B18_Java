package REPLIT;

import java.util.Scanner;

public class aa {
    public static int max(int x,int  y){
        if(x>y) {
            return x;
        }else return y;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int c = max(x,y);
        System.out.println(c);
    }
}

