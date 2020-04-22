package REPLIT;
import java.util.Scanner;
public class seMiHo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int totalsecond = input.nextInt();
        int hours = ((totalsecond/60) / 60) %60;
        int minute = (totalsecond/60) %60;
        int second = totalsecond % 60;
        System.out.println(hours+" hours, " + minute +" minutes, and " + second +" seconds");
    }
}
