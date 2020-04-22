package REPLIT;

public class ApartmantLeasing {
    public static void main(String[] args) {


        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = 5;
        int startingPrice=0;
        String Message = " ";

        if(numberOfBedrooms ==1) {
            Message = "One Bedroom Selected";
            startingPrice=1100;
        } else  if(numberOfBedrooms ==2) {
            Message = "Two Bedroom Selected";
            startingPrice=1850;
        } else if(numberOfBedrooms ==3) {
            Message = "Three Bedroom Selected";
            startingPrice=2550;
        }
        if (Message == " "){
            System.out.println("No such Bedrooms available");
        } else {
            System.out.println(Message);
            System.out.println("Starting price: "+startingPrice);
        }


    }



}
