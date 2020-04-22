package REPLIT;

    import java.util.Scanner;
    public class Citizen {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println
                    ("Enter current count for seniorCitizens and nonSeniorCitizens:");
            int currentSenior = input.nextInt();
            int currentNonSenior = input.nextInt();
            System.out.println
                    ( "What is new citizen's age?");
            int age = input.nextInt();
            String sonuc ="";
            if(age >= 65) {
                sonuc = "Senior Citizen";
                currentSenior++;
            } else {
                sonuc = "Non-Senior Citizen";
                currentNonSenior++;
            }
                System.out.println(sonuc);
                System.out.println("New seniorCitizens count "+ currentSenior);
                System.out.println("New nonSeniorCitizens count "+ currentNonSenior);


        }


}
