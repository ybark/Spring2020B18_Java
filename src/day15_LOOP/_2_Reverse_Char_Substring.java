package day15_LOOP;
/*
       2. write a program that can reverse the following string:
              String str = "Java";
              output: avaJ
          please provide two solutions:
                      first solution, you MUST use substring method
                      second solution, you MUST use charAt method
       */

public class _2_Reverse_Char_Substring {
    public static void main(String[] args) {
        String str = "Java";
          //          0123

        String reverse =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        System.out.println(reverse);

        String reverse2 = str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);
        System.out.println(reverse2);

    }
}
