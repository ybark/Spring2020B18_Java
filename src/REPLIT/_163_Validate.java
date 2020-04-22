package REPLIT;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;


public class _163_Validate {
    public static void main(String[] args) {
        boolean isAvailable = true;
        int day = 9;
        int month = 7;
        int year = 2018;
        System.out.println(simpleRoomBook(isAvailable,month,day,year));
    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
    //return (isAvailable==true)? (year==2018)?
     //       ( !(month==7 && day>=1 && day<=8))? true :false:false:false;

        boolean result = true;

        if (isAvailable==true) {
            if (year==2018) {
                if (!(month==7 && day>=1 && day<=8)){
                    result = true;} else {result=false;}


            } else {result=false;}

        } else {result =false;}
        return result;
    }


}









