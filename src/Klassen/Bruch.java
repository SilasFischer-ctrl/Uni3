package Klassen;

public class Bruch {
    public int z;
    public int n;

    public Bruch (int zaehler, int nenner){
        z = zaehler;
        n = nenner;
    }

    public String toString(){
        String s = z + " : " + n;
     return s;
    }
}
