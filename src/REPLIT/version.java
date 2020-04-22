package REPLIT;

public class version {

    public static void main(String[] args) {
        double version = 1.6;
        String result = " ";
        boolean JellyBean = ((version ==4.1) || (version > 4.1)) && ((version == 4.31) || (version < 4.31));
        boolean Kitkat = ((version ==4.4) || (version > 4.4)) && ((version == 4.44) || (version < 4.44));
        boolean Lollipop = ((version ==5.0) || (version > 5.0)) && ((version == 5.11) || (version < 5.11));
        boolean Oreo = ((version ==8.0) || (version > 8.0)) && ((version == 8.1) || (version < 8.1));

        if (version == 1.5) {
            result = "Cupcake";
        } else if (version == 1.6) {
            result = "Donut";
        } else if (version == 2.1) {
            result = "Eclair";
        } else if (version == 2.2) {
            result = "Froyo";
        } else if (version == 2.3) {
            result = "Gingerbread";
        } else if (version == 3.1) {
            result = "Honeycomb";
        } else if (JellyBean) {
            result = "Jelly Bean";
        } else if (Kitkat) {
            result = "KitKat";
        } else if (Lollipop) {
            result = "Lollipop";
        } else if (Oreo) {
            result = "Oreo";
        }

        if (result == " ") {
            System.out.println("Sorry, I don't know this version");
        } else {
            System.out.println(result);
        }
    }
}

