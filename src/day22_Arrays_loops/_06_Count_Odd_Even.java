package day22_Arrays_loops;

public class _06_Count_Odd_Even {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int odd = 0;
        int even = 0;

        for (int each:arr) {
            // if (each % 2 ==0 ){
                even++;
            //} else { odd++;}
            if (each % 2 ==0) {
                even ++; continue;
            }
            odd++;

        }

        System.out.println("even numbers:" + even);
        System.out.println("odd numbers :" +odd);
    }
}
