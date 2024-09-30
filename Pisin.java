public class Pisin {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Ei parametreja");
        } else {
            String pisinParametri = "";

            for (int i = 0; i < args.length; i++) {
                if (args[i].length() > pisinParametri.length()) {
                    pisinParametri = args[i];
                }
            }

            System.out.println("Pisin parametri: " + pisinParametri);
        }
    }
}