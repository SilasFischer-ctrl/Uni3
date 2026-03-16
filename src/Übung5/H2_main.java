package Übung5;

public class H2_main {
    public static void main (String[] args){

        int n=299, digits=1;
        int [] a = {0,0,0,0,0,0,0,0,0};

        int temp = n;
        while (temp >= 10){
            temp = temp / 10;
            digits++;
        }

        for (int i = 0; n > 0; i++){
            a[(a.length-1)-i] = n % 10;
            n = n / 10;
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
