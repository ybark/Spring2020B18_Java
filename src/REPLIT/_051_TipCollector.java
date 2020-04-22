package REPLIT;

        import java.util.Scanner;

public class _051_TipCollector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // -------- data entering ----------------

        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();


        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();


        System.out.println("Service Quality:");
        String tipOption = scan.next();

        double totalTip = 0;
        String poor = "poor";
        String fair = "fair";
        String good = "good";
        String great = "great";
        String excellent = "excellent";

        //---------- Tip Calculation ----------

        if (tipOption.equalsIgnoreCase(poor)) {
            totalTip = checkAmount * 0.05;
        } else if (tipOption.equalsIgnoreCase(fair)) {
            totalTip = checkAmount * 0.1;
        } else if (tipOption.equalsIgnoreCase(good)) {
            totalTip = checkAmount * 0.15;
        } else if (tipOption.equalsIgnoreCase(great)) {
            totalTip = checkAmount * 0.20;
        } else if (tipOption.equalsIgnoreCase(excellent)) {
            totalTip = checkAmount * 0.25;
        }


        double tipPerPerson = (totalTip / numberOfPeople);

        double totalPayment = checkAmount + totalTip;
        double totalPerPerson = totalPayment / numberOfPeople;


        //--------- Assignmet of number of people to the & characters ------

        String peopleChar = "";
        switch (numberOfPeople) {
            case (1):
                peopleChar = "&";
                break;
            case (2):
                peopleChar = "&&";
                break;
            case (3):
                peopleChar = "&&&";
                break;
            case (4):
                peopleChar = "&&&&";
                break;
            case (5):
                peopleChar = "&&&&&";
                break;
            default:
                break;

        }

        // ------------------report ----------------


        System.out.println("Number of people entered: " + peopleChar);
        System.out.println("Total to pay: " + totalPayment);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);


    }
}
