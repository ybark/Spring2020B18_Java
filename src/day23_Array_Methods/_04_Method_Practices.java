package day23_Array_Methods;

public class _04_Method_Practices {
    public static void main(String[] args) {

        oddNumber();
        System.out.println("--------------");
        evenNumber();

    }

    public static void oddNumber () {

        for (int i=0;i<=100;i++) {

            if (i%2 != 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


    public static void evenNumber () {
        for (int i=0;i<=100;i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }





}
