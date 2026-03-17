package Übung8;

public class P1_main {
    public static void main (String []args){
        int temp = getNumber(42);
        System.out.println(temp);
    }

    public static int getNumber (int a){
        int test = (a>42) ? 42 : 0;
        return test;
    }
}
