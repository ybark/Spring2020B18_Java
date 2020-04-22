package REPLIT;

import java.util.Scanner;

public class _114_Array_Find_Non_Dublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[7];

        for (int i = 0; i < 7; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 7; i++) {
                if (nums[j] == nums[i]) {
                    count++;

                }


            }
            if (count == 1) {
                System.out.println(nums[j]);
                System.exit(0);
            } else {
                count = 0;
            }
        }
    }
}