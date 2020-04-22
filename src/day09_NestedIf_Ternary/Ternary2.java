package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {

        String result ="";
        if (9>7) {
            result = "9 is greater";
        }else {
            result = "7 is greater";
        }
        String result2 = (9>7)? "9 is greater" : "7 is greater";

        System.out.println(result);
        System.out.println(result2);
        System.out.println("----------------------------------------");

        int age = 20;
        String eligibilit ="";
        if (age >= 21) {
            eligibilit = "Eligible";
        }else {eligibilit = "not eligible";
        }

        boolean eligibility = (age >=21) ? true : false;


        System.out.println("------------------------------");
        int ageOfPerson = 20;
        String EligibleToVote = (ageOfPerson >= 18) ? "YES" : "No";
        System.out.println(EligibleToVote);


    }
}
