package Übung6;

public class H2_main {
    public static void main (String[] args){

        int [] c = {1,2,3};
        int [] d = {1,2,3};
        boolean test = compareArrays(c,d);
        System.out.println(test);
    }

    public static boolean compareArrays(int[] a, int[] b){
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
