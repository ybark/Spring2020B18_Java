package day10_Switch_Scanner;

public class days {
    public static void main(String[] args) {
        int num = 3;
        String result ="";
        if (num>=1 && num <=7) {
            result = (num ==1) ? "Monday": (num==2)? "Tuesday" : (num==3) ? "Wednesday" :
                    (num==4)? "Thursday" : (num==5)? "Friday": (num==6)? "Saturday":"Saturday";
        } else {
            System.out.println("invalid entry");

        }
        System.out.println("it is " + result);
    }
}
