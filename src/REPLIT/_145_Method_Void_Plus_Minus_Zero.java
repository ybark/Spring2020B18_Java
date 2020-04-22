package REPLIT;

import java.util.Scanner;

public class _145_Method_Void_Plus_Minus_Zero {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main
    public static void plus_minus (int[] arr) {
        int zero =0;
        int positive =0;
        int negative=0;
        for (int i=0;i<=arr.length-1;i++) {
            if (arr[i] == 0) {
                zero++;
            }else
            if (arr[i] >0) {
                positive++;
            } else
            if (arr[i] <0) {
                negative++;
            }

        }
        System.out.println("positives:"+positive+", negatives:"+negative+", zeros:"+zero);
    }





}



