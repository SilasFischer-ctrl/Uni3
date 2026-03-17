package Übung6REP;

public class P3_main {
    public static void main (String[] args){
        int [] a = {1,-4,-5,5,-2};
        int test;
        test = methode(a);
        System.out.println(test);
    }

    public static int methode (int[] a){
        if (a.length < 2) return -1;


        int max2 = -1;
        int max = 0;
        for (int i = 0; i < a.length; i++){
            int wert = 0;
            if (a[i] < 0){
                wert = -a[i];
            } else wert = a[i];
            if (wert > max) {
                max = wert;
            }
        }
        for (int j = 0; j<a.length; j++){
            int wert2 = 0;
            if (a[j] < 0){
                wert2 = -a[j];
            } else wert2 = a[j];
            if (wert2 > max2 && wert2 < max){
                max2 = wert2;
            }
        }
        if (max2 == -1) return -1;

        return max2;
    }
}
