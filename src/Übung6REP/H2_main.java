package Übung6REP;

public class H2_main {
    public static void main (String[] args){
        int [] a = {1,2,3,4};
        int [] b = {1,2,3};
        boolean test;
        test = compareArrays(a,b);
        System.out.println(test);
    }

    public static boolean compareArrays (int[] a, int[] b){
        if (a.length != b.length) return false;

        for (int i=0; i<a.length; i++){
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
