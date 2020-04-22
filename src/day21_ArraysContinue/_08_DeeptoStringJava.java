package day21_ArraysContinue;

import java.util.Arrays;

public class _08_DeeptoStringJava {
    public static void main(String[] args) {

        int [] ar1D = {1,2,3};
        int [][] ar2D = { {1,2,3}, {4,5,6,7}, {9,8,7}  };

        System.out.println(Arrays.toString(ar1D)); //// sadece tek boyutlu Arrayler icin
        System.out.println(Arrays.deepToString(ar2D));




    }
}
