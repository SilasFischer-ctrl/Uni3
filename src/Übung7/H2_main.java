package Übung7;
import java.util.Arrays;

public class H2_main {
    public static void main (String[] args){
        int [] a = {2,7,1,9};
        int [] b = {5,6,7};
        int start = 3;
        int end = 2;
        int [] test = change(a, b, start, end);
        System.out.println(Arrays.toString(test));
    }

    public static int[] change (int[] a, int [] b, int start, int end){
        if (end > start){
            if (Arrays.compare(a, b) != 0){
                int[] neu = Arrays.copyOfRange(a,0, a.length);
                return neu;
            } else {
                Arrays.sort(a);
                int [] neu = Arrays.copyOfRange(a, start, end);
                return neu;
            }
        } else {
            int[] neu = {};
            return neu;
        }

    }
}
