package day28_DateTime;
import java.time.LocalDate;
public class _01_LocalDate_Practice {
    /* Warmup task:
            1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays

     */

    public static void main(String[] args) {

        String [] friends = {"john","Aoron,","Daniel"};
        LocalDate johnBirthday = LocalDate.of(2020,03,05);
        LocalDate AoranBirthday = LocalDate.of(2000,10,12);
        LocalDate DanielBirthday = LocalDate.of(2010,05,06);

        LocalDate[] birthdays = {johnBirthday, AoranBirthday, DanielBirthday};

        for (int i = 0 ; i<friends.length;i++) {
            String name = friends[i];
            LocalDate bd = birthdays[i];
            System.out.println("name " + name + " birthday " + bd );
        }


    }


}
