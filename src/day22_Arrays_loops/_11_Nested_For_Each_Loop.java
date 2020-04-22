package day22_Arrays_loops;

public class _11_Nested_For_Each_Loop {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[][] arr2D = {{1,2,3}, {4,5,6}};


        for (int each:arr) {
            System.out.print(each +" ");
        }
        System.out.println();

        for (int[] each1Darray:arr2D){


            for (int eachelement:each1Darray) {
                System.out.print(eachelement+" ");
            }

            System.out.println();
        }

        System.out.println("=====================");

        char [][] ch2D = { {'A','B'}, {'C','D','E'}};

        for (char[] each1DArray:ch2D) {

            for (char eachElement:each1DArray) {

                System.out.print(eachElement+" ");
            }
            System.out.println();
        }
    }
}
