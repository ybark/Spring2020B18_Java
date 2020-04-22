package day09_NestedIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {

        double salary=12000;
        byte workHistory = 1;

        if (salary >= 30000) { // might be qualified
            if (workHistory >=2) {
                System.out.println(" You are eligible for loan");
            } else {
                System.out.println("you must have been on job at least 2 years");
            }
        } else {
            System.out.println("You are not eligible You must earn at least 30.000 yearly ");
        }


    }
}
