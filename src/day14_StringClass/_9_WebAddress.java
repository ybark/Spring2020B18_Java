package day14_StringClass;
  /*
        write a program that can validate if a weba ddress is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, .net, .Gov
         */


public class _9_WebAddress {
    public static void main(String[] args) {

        String website = "cyberte.www.com" ;
        website =    website.toLowerCase();

        boolean validEnding = website.endsWith(".com") ||  website.endsWith(".edu") ||  website.endsWith(".gov") ;

        if(website.startsWith("www.") && validEnding)  {

            System.out.println("Valid address");

        }else{
            System.out.println("Invalid Address");

        }





    }

}
