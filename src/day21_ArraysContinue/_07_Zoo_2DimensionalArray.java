package day21_ArraysContinue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _07_Zoo_2DimensionalArray {
    public static void main(String[] args) {

        String[] wildAnimals = {"Tiger","Lion","Monkey","Turtle","Crocodile"};
        //                          0       1       2       3       4
        String[] birds = { "Eagle", "Duck","peacock","Chicken"};
        //                  0           1       2       3

        String zoo[][] = { wildAnimals,birds };
        //                     0 ,       1

        // Find the Chicken

        String kfc = zoo[1][3];
        System.out.println(kfc);

        System.out.println("----------------");

        // find the ducks

        String brd = zoo[1][1];
        System.out.println(brd);

        System.out.println("==============");

        for (String eachBirds:zoo[1]) {
            System.out.println(eachBirds);

        }
        System.out.println(Arrays.toString(wildAnimals));

        System.out.println("================");

        for (String each:zoo[0]) {

            System.out.println(each);
        }
        System.out.println("==================");

        //   ////////////// delete turtle from the array ////////////////
        for (String each:zoo[0]) {
            if (each == "Turtle"){
                continue;
            }
            System.out.println(each);
        }



    }
}
