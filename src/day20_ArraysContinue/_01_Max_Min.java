package day20_ArraysContinue;

// Find the min number from the given array

// Find the min number from the given array

public class _01_Max_Min {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,200,5000,2500,75,-1};
        int lastindex = arr.length-1;
        int max = arr[0];
        int min = arr[0];
        int min2= arr[0];

        for (int i=0;i<=lastindex;i++) {
            if (arr[i] > max) {
                max=arr[i];
            } else if(arr[i]<min2 ) {
                min2=arr[i];
            }
        }

        for (int j=0;j<=lastindex;j++)
            if (arr[j]<min) {
                min=arr[j];
            }

        System.out.println(min2);
        System.out.println(max);
        System.out.println(min);
    }

}
