package day21_ArraysContinue;
/*
  given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */
public class _04_gmailsExcluding_endwith_Contains {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};


        for(String eachMail:emails) {
            if (!eachMail.endsWith("@gmail.com") ) {
                System.out.println(eachMail  +"---");
            }

         if (eachMail.endsWith("@gmail.com")) {
             continue;

         }
            System.out.println(eachMail);
        }


    }
}
