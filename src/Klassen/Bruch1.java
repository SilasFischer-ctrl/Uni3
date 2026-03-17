package Klassen;

public class Bruch1 {
    public int z;
    public int n;

    public Bruch1(int zaehler, int nenner){
        z = zaehler;
        n = nenner;
    }

    public String toString(){
        String s = z + " : " + n;
     return s;
    }
}