package Übung6;

public class H3_main {
    public static void main (String[] args){
        int [] c = {1,2,3};
        int [] d = {1,2,3};
        boolean test = compareArraysVal(c,d);
        System.out.println(test);
    }

    public static boolean compareArraysVal (int[] a, int[] b){
        if (a.length != b.length) return false;

        for (int i = 0; i< a.length; i++){
            int wert = a[i];
            int countA = 0;
            int countB = 0;
            for (int j = 0; j<a.length; j++){
                if (a[j] == wert){
                    countA++;
                }
                if (b[j] == wert){
                    countB++;
                }
            }
            if (countA != countB){
                return false;
            }
        }
        return true;
    }
}
