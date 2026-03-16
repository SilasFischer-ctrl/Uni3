package Übung6;

public class P3_main {
    public static void main (String[] args){
        int [] test = {1,-4,-5,4,-2};
        int b = methode(test);
        System.out.println(b);
    }

    public static int methode(int[] a){
        if (a.length < 2){
            return -1;
        }
        int maxBetrag =-1;
        for (int i = 0; i < a.length; i++){
            int betrag;
            if (a[i] < 0){
                betrag = -a[i];
            } else betrag = a[i];
            if (betrag > maxBetrag){
                maxBetrag = betrag;
            }
        }
        int zweitBetrag = -1;
        for (int i = 0; i < a.length; i++){
            int betrag;
            if (a[i] < 0){
                betrag = -a[i];
            } else betrag = a[i];
            if (betrag < maxBetrag && betrag > zweitBetrag){
                zweitBetrag = betrag;
            }
        }
        if (zweitBetrag == -1){
            return -1;
        }
        return zweitBetrag;
    }
}
