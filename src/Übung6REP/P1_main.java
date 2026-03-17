package Übung6REP;

public class P1_main {
    public static void main (String[] args){
        int test = 5;
        test = squared(test);
        System.out.println(test);
    }

    public static int squared (int a){
        return (a+1) * (a+1);
    }
}
