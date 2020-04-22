package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        boolean USCitizen =false;
        int age = 171;
        if (USCitizen) {
            if (age>17) {
                System.out.println("you are eligible to vote Donald Trump");
            } else{
                System.out.println("go home and grow up and come back");
            }
        } else {
            System.out.println(" only US citizen can vote Donald Trump");
        }
        System.out.println("--------------------------------------------");


        int score = 80;
        String grade ="";

        if (score >= 0 && score<=100) {
            if (score >=90) {
                grade ="A";
            } else if (score >= 80) {
                grade ="B";
            } else if (score>= 70){
                grade ="C";
            }else if (score >= 60) {
                grade = "D";
            }else if (score >= 50) {
                grade = "E";
            }else if (score >= 40) {
                grade ="F";
            }
        } else {
            grade ="invalid";
        }
        System.out.println("------------------------------------------------");
        int score2=75;
        String grade2="";
       if (score2>=0 && score<100) {

            grade2 = (score2 >=90) ? "A" : (score2>=80) ? "B" : (score2 >=70) ? "C" :
                    (score2 >=60) ? "D" : "F";
        } else{
        grade2 ="invalid entry";
       }


        System.out.println(grade);
    }
}
