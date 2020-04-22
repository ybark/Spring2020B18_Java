package day12_JavaRecap;


import org.w3c.dom.ls.LSOutput;

public class TernaryPractice2 {
    public static void main(String[] args) {

     char ch1 = 'D';

     String result = (ch1=='A')? "A is selected" : (ch1=='B') ? "B is selected":
             (ch1=='C')? "C is selected": (ch1=='C')? "C is selected":
                     (ch1=='D')? "D is selected": (ch1=='E')? "E ıs selected"
                     : "Invalid Character";

        System.out.println(result);
    }

}
