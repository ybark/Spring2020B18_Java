package day24_Methods;

import java.util.Arrays;
import Resources.Library;
public class _09_Test {
    public static void main(String[] args) {
        String str = "Ey edip adanada pide ye";

        String RevStr = Library.Reverse2(str);
        System.out.println(RevStr);
        System.out.println(str.equalsIgnoreCase(RevStr));

        int[] arr = {10000,3000,2000,40000,50000,1000000};
        arr = Library.SortDescending2(arr);

        System.out.println(Arrays.toString(arr));


    }
}
