package day24_Methods;

import java.util.Arrays;

public class _01_Max_Min_Descending {

    public static void main(String[] args) {
        int [] arr = {10,9,8,7,6,5,4,3,2,1};
        MaxNumber(arr);  // if the parameter is Array we have to send same same parameter
                        // asagidaki metaun icerisinde MaxNumber da belirtilecek olan sey
                        // yukarida gonderdigin parametre ile ayni olmali



        MinNumber(arr);

        Descending(arr);




    }

    public static void MaxNumber (int[] array) { // yukaridan gonderilen parametre int dizi oldugundan
                                                // burada cagrilan parametre yukaridaki ile ayni type
                                                //sekilde olmali yani int[] array

        Arrays.sort(array);
        System.out.println(array[array.length-1]);
    }

    public static void MinNumber (int[] array) {
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    public static void Descending (int[] array) {
        Arrays.sort(array);
        int[] reverseArray =new int[array.length];
        int j=0;
        for (int i=array.length-1;i>=0;i--) {
            reverseArray[j]=array[i];
            j++;
            System.out.print(array[i] + " ");
        }

    }
}


