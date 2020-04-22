package REPLIT;

import java.util.Scanner;

public class _70_Alejandro_Contains {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String name = "alejandro";
        str = str.toLowerCase();

        if (str.contains(name)){
            System.out.println("read this mail");

        } else System.out.println("dont read");

    }
}
