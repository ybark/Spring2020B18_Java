package day24_Methods;

import java.util.Arrays;

public class _07_Method_Array_Descending {

    public static void main(String[] args) {

        int arr1[] = {1,10,9,8,14,15};
        int arr2[] = {200,100,150,500,400};
        int arr3[] = {1000,800,5000,3000};

        SortDescending(arr1);

        arr2=SortDescending2(arr2);
        System.out.println(Arrays.toString(arr2));

        arr3 =SortDescending2(arr3);
        System.out.println(Arrays.toString(arr3));



    }

    public static void SortDescending (int[] arr) {
        Arrays.sort(arr);
        int[] RevArr = new int[arr.length]; // yeni olusturulacak olan ters dizi
                                            // KESINLIKLE ILK DIZI ILE AYNI OLCUDE OLMALI
                                            // SAKIN ARR.LENGTH-1 YAPMAAAAAAAA

        int count =0;
        for (int i=arr.length-1;i>=0;i--) {
            RevArr[count] = arr[i];
            count++;
        }
        System.out.println(Arrays.toString(RevArr));

    }

    public static int[] SortDescending2 (int[] arr) {
        Arrays.sort(arr);
        int[] RevArr = new int[arr.length]; // yeni olusturulacak olan ters dizi
        // KESINLIKLE ILK DIZI ILE AYNI OLCUDE OLMALI
        // SAKIN ARR.LENGTH-1 YAPMAAAAAAAA

        int count =0;
        for (int i=arr.length-1;i>=0;i--) {
            RevArr[count] = arr[i];
            count++;
        }
       return RevArr;

    }



}
