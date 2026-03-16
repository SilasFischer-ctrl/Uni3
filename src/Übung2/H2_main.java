package Übung2;

public class H2_main {
    public static void main (String[] args){

        int i=10, j=2, k=3, min=0, max=10;
        if (i<j && i<k){
            min = i;
        } else if (j<i && j<k) {
            min =j;
        } else min = k;

        if (i>j && i>k){
            max = i;
        } else if (j>i && j>k) {
            max =j;
        } else max = k;

        System.out.println(min);
        System.out.println(max);
    }
}
