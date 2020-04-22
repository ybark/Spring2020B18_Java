package REPLIT;

import java.util.Scanner;

public class _71_Alejandro_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean read = str.contains("alejandro") && str.contains("project");

        if (read) {
            System.out.println("read this mail");
        } else {
            System.out.println("dont read");
        }
    }
}
