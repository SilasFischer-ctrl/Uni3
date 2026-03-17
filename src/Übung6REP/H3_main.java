package Übung6REP;

public class H3_main {
    public static void main (String[] args){
        int [] a = {1,2,3};
        int [] b = {1,3,3};
        boolean test;
        test = compareArraysVal(a,b);
        System.out.println(test);
    }

    public static boolean compareArraysVal (int[] a, int[] b){
        if (a.length != b.length) return false;

        for (int i=0; i < a.length; i++){
            int count1 = 0;
            int count2 = 0;
            int wert = a[i];
            for (int j = 0; j < a.length; j++){
                if (wert == a[j]){
                    count1++;
                }
                if (wert == b[j]){
                    count2++;
                }
            }
            if (count1 != count2) return false;
        }
        return true;
    }
}
