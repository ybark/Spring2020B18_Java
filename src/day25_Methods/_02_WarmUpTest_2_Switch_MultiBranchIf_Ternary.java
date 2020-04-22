package day25_Methods;

import java.util.Scanner;
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "ie", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */
public class _02_WarmUpTest_2_Switch_MultiBranchIf_Ternary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(getDriver1(str));
        System.out.println(getDriver_2(str));
        System.out.println(getDriver_3(str));

    }
    // ================== getDriver_1 ============================
    public static String getDriver1 (String str) {
        String result ="";
        switch (str.toLowerCase()) {
            case ("chrome"):    result = "Chrome Driver";
                break;
            case("firefox"):    result ="Firefox Driver";
                break;
            case("ie"):         result ="ie Driver";
                break;
            case("safari"):     result ="Safari Driver";
                break;
            case("edge"):       result ="edge Driver";
                break;
            case("opera"):      result ="opera Driver";
                break;
            default:            result = "Invalid Entry";


        }

        return result;
    }

    //=================== getDriver_2 =============================

    public static String getDriver_2 (String str) {

        String result="";
        str=str.toLowerCase();
        if(str.equals("chrome")) { result ="chrome Driver"; }
        else
        if(str.equals("firefox")) { result ="Firefox Driver"; }
        else
        if(str.equals("ie")) { result ="ie Driver"; }
        else
        if(str.equals("safari")) { result ="Safari Driver"; }
        else
        if(str.equals("edge")) { result ="Edge Driver"; }
        else
        if(str.equals("opera")) { result ="Opera Driver"; }
        else {
            result ="invalid Entry";}

        return result;
        }


        // ========================getDriver_3 =========================

        public static String getDriver_3 (String str) {
        // variable name = ()?  "value" ==> if
        // : ()?  "value" ==> else if
       // : "value" ==> else
        String result ="";
        str=str.toLowerCase();
        return  (str.equals("chrome"))? "Chrome Driver":
                (str.equals("firefox"))? "Firefox Driver":
                (str.equals("safari"))? "Safari Driver":
                (str.equals("ie"))? "Ie Driver":
                (str.equals("edge"))?"Edge Driver":
                (str.equals("opers"))? "Opera Driver":
                             "invalid Entry";
        /*
        ========================second solution ===================
        result =(str.equals("chrome"))? "Chrome Driver":
                (str.equals("firefox"))? "Firefox Driver":
                (str.equals("safari"))? "Safari Driver":
                (str.equals("ie"))? "Ie Driver":
                (str.equals("edge"))?"Edge Driver":
                (str.equals("opers"))? "Opera Driver":
                             "invalid Entry";
         */





        }


    }



