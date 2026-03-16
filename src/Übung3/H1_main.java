package Übung3;

public class H1_main {
    public static void main(String[] args) {

        double guthaben = -100, monEingang = 200.00;
        int rating = -2;
        boolean warnhinweis = false, negativ = false;

        if (guthaben < 0) {
            negativ = true;
            if (monEingang >= -guthaben) {
                rating++;
            } else if (monEingang < -guthaben) {
                rating--;
                if (rating < 0) {
                    warnhinweis = true;
                } else warnhinweis = false;
            }
        } else if (guthaben > 0) {
            rating += 3;
            negativ = false;
        } else {
            rating += 2;
            negativ = false;
        }
        System.out.println(negativ);
        System.out.println(rating);
        System.out.println(warnhinweis);
    }
}
