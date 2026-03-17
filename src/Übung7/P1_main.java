package Übung7;

import Klassen.Bruch;

public class P1_main {
    public static void main (String []args){
        multFrac(5,2,3,4);
        Bruch b1 = new Bruch(5,2);
        Bruch b2 = new Bruch(3,4);
        multFrac(b1, b2);
        System.out.println(b1);
    }

    public static void multFrac(int z1, int n1, int z2, int n2){
        z1 = z1 * z2;
        n1 = n1 * n2;
        System.out.println(z1 + " : " + n1);
    }

    public static void multFrac(Bruch a, Bruch b){
        int ergebnisZaehler;
        int ergebnisNenner;
        ergebnisZaehler = a.z * b.z;
        ergebnisNenner = a.n * b.n;
        System.out.println(ergebnisZaehler + " : " + ergebnisNenner);
    }
}
