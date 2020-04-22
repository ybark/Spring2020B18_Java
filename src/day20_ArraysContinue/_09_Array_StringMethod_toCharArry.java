package day20_ArraysContinue;

import java.util.Arrays;

public class _09_Array_StringMethod_toCharArry {

    public static void main(String[] args) {
        String name = "yucel";
        char[] character = name.toCharArray();

        System.out.println(Arrays.toString(character));

        System.out.println("-------------------------");

        /// verilen 2 farkli cumklenin bir birine esit olup olmadigini kontrol eder


        String str1 ="Cybertek School".toLowerCase();
        String str2 ="School Cybertek".toLowerCase();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean check = Arrays.equals(ch1,ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        System.out.println(check);



    }
}
