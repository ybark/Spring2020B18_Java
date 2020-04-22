package day10_Switch_Scanner;

public class DaysInMonth {
/*
    28 days :2
    30 days : 4,6,9,11
    31 days : 1,3,5,7,9,10,12

 */
    public static void main(String[] args) {

        int num =-2;
        boolean day28 = num ==2;
        boolean days30 = num==4 || num==6 || num ==9 || num==11;
        String result ="";

        if (num>0 && num<13) {
            result = (day28)?"28 days" : (days30)? "30 days" : "31 days";

        } else {
            result ="invalid Entry";
        }

        System.out.println(result);
    }
}
