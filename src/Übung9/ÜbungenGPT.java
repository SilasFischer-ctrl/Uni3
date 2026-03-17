package Übung9;
import java.util.ArrayList;
import java.util.Arrays;

public class ÜbungenGPT {
    public static void main(String[] args) {
        ArrayList<Tier> tiere = new ArrayList<Tier>();
        Tier t1 = new Tier("Hund", 5);
        Tier t2 = new Tier("Katze", 4);
        Tier t3 = new Tier("Hase", 2);

        tiere.add(t1);
        tiere.add(t2);
        tiere.add(t3);

        for (int i = 0; i < tiere.size(); i++){
            System.out.println(tiere.get(i).name);
        }
    }
}
