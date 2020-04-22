package day22_Arrays_loops;

public class _08_2D_DimensinalArray_Nested_Loop {
    public static void main(String[] args) {
        //                   0   1      0   1   2      0   1   2   3
        char[][] arr2D = { {'A','B'}, {'C','D','E'}, {'F','J','H','I'}  };
        //                      0           1               2       // 2 boyutlu dizinin her bir boyutunun index numarasi

        // arr2D[0] ==> {'A','B'

        for (int i=0;i<arr2D[0].length;i++) {
            System.out.println(arr2D[0][i]);
        }
        System.out.println("---------------");

        for (int i=0;i<arr2D[1].length;i++) {
            System.out.println(arr2D[1][i]);
        }
        System.out.println("---------------");

        for (int i=0;i<arr2D[2].length;i++) {
            System.out.println(arr2D[2][i]);
        }
        System.out.println("===================");

        for(int j=0;j<arr2D.length;j++) {
            for (int i=0;i<arr2D[j].length;i++) {
                System.out.println(arr2D[j][i]);
            }
            System.out.println("---------------");
        }
    }
}
