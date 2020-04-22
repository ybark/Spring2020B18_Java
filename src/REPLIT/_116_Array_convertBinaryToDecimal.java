package REPLIT;

import java.util.Scanner;

public class _116_Array_convertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        int[] decimal = {128,64,32,16,8,4,2,1};
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        int result=0;
       for (int i=0; i<binary.length;i++) {
           if (binary[i]==0) {
               continue;}

               result+=decimal[i];

           System.out.println(binary[i]+"\t" + decimal[i]);
       }

        System.out.println(result);
    }
}
