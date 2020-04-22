package day25_Methods;
import Resources.Library;

public class _05_Test {
    public static void main(String[] args) {
        String str1 = "AABBCDEB";
        String str2 = "B";

        String result = Library.removeDublicates(str1);
        System.out.println(result);
        int result2 = Library.frequncy_str2_in_str1(str1,str2);




    }
}
