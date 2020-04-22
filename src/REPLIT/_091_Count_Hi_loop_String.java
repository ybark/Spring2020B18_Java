package REPLIT;

import java.util.Scanner;

public class _091_Count_Hi_loop_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean stop = true;
        int count=0;
        while (stop) {
            if (str.contains(" hi") || str.contains("hi ")) {
                str = str.replaceFirst("hi", " ");
                count++;
            } else stop = false;
        }
        System.out.println(count);
    }
}
