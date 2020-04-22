package REPLIT;

import java.util.Arrays;
import java.util.Scanner;

public class _104_Array_has_55_loops_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        String result="";
        for (int i=0;i<=nums.length-2;i++) {
            if(nums[i]== 5 && nums[i+1]==5) {
               result ="true";break;
            } else{result="false";}
        }
        System.out.println(result);



    }
}
