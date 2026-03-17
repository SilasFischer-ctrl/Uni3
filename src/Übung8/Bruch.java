package Übung8;

public class Bruch {
    public int zaehler;
    public int nenner;

    public Bruch (int zaehler, int nenner){
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggt (int x, int y){
        int ggt = 1;
        while (ggt != 0){
            ggt = x % y;
            x = y;
            y = ggt;
        }
        return x;
    }

    public void shorten(){
        int teiler = ggt(zaehler, nenner);
        this.zaehler = zaehler / teiler;
        this.nenner = nenner / teiler;
    }

    public boolean hasSameValueAs(Bruch b){
        int wert1 = this.zaehler * b.nenner;
        int wert2 = b.zaehler * this.nenner;
        if (wert1 != wert2){
            return false;
        } else return true;
    }
}
