package OfficeHours.Practice_04_08_2020;

public class _06_NestedLoop_Practice {
    public static void main(String[] args) {


        int j= 5;
        while (j<=10) {
            for (int i = 10; i <= 50; i += 10) {
                System.out.print(i + " ");
            }

        System.out.println();
        j++;
        }

        System.out.println("--------------------------");

        for (int t=1;t<=15;t++)  {

            for (int y=1;y<=20;y++){
                System.out.print("* ");
            }
            System.out.println();


        }

        System.out.println("--------------------------");

        for(int e=0; e<=7;e++) {

            for (int q = 0; q <= e; q++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        //--------------------ters ucgen -------------

        for (int o=7;o>=0;o--){
                for (int p=1;p<=o;p++) {
                    System.out.print(" * ");
                }


            System.out.println();
        }



    }
}
