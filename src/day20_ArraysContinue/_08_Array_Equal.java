package day20_ArraysContinue;
import java.util.Arrays;
public class _08_Array_Equal {

    public static void main(String[] args) {

        int[] arr = {1,2,3,};
        int[] arr2 = {1,2,3};

        boolean result = Arrays.equals(arr,arr2);

        System.out.println(result);

        int[] arr3 = {3,2,1};
        int[] arr4 = {1,2,3};

        boolean result2 = Arrays.equals(arr3,arr4);
        System.out.println(result2);

        int[] arr5 = {3,2,1};
        int[] arr6 = {1,3,2};

        boolean result3 = Arrays.equals(arr5,arr6);

        Arrays.sort(arr5);
        Arrays.sort(arr6);

        System.out.println(result3);




    }
}
