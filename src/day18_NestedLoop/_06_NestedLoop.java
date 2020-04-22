package day18_NestedLoop;

public class _06_NestedLoop {
    public static void main(String[] args) {

        for (int z=1;z<=5;z++) {
            for (int i=1;i<=5;i++) {
                System.out.print(i);
            }
            System.out.println();

        }

        System.out.println("------------------------------");


        for (int i=0;i<7;i++) {

            int a = 1;
            while (a <= 6) {

                System.out.print("*");
                a++;
            }
            System.out.println();
        }


    }
}
