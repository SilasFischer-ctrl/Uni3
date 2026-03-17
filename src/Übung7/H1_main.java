package Übung7;
import Klassen.Zahl;

public class H1_main {
    public static void main (String[] args){
        Zahl z = new Zahl();
        z.setEven();
        System.out.println(z.even);
        z.setPositive();
        System.out.println(z.positive);
        z.setSmall();
        System.out.println(z.small);

    }
}
