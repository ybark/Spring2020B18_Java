package day19_Arrays;

public class _04_Array_Friends {
    public static void main(String[] args) {

        String [] friends = {"yucel", "asiya","ahmet","canan"};
        //                     0         1      2        3

        String name1 = friends[2];
        String name3 = friends[0];

        System.out.println(name1);
        System.out.println(name3);
        System.out.println(friends[3]);

        System.out.println("---------------");

        for (int i=0;i<=friends.length-1;i++) {
            System.out.println(friends[i]);
        }


    }
}
