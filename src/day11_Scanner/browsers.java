package day11_Scanner;

//import java.util.Scanner;

public class browsers {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        String browserName = "Firefox";

        switch (browserName) {
            case "firefox": // or  olarak kullanılmıştır. yani ilk harf büyük veya küçük girilmesi
                            // durumunda aynı case işlesin diye yapılmıştır.
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;
            case "chrome":
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;
            case"safari":
            case"Safari":
                System.out.println("Safari is opening...");
                break;
            case"opera":
            case"Opera":
                System.out.println("Opera is opening...");
                break;
            default:
                System.out.println("Invalid entry");

        }

    }
}
