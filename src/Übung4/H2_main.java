package Übung4;

public class H2_main {
    public static void main (String[] args){

        boolean x,y,a,b,c=true;
        int input = 10;

        if (input == 10 || input == 11){
            x = true;
        } else x = false;

        if (input == 11 || input == 1){
            y = true;
        } else y = false;

        if (x && y ){
            a = true;
        } else a = false;

        if (x || x !=y){
            b = true;
        } else b = false;

        if (x){
            if (y){
                c = false;
            } else if (!y){
                c = true;
            }
            } else if (!x) {
            if (y){
                c = false;
            } else if (!y) {
                c = true;
            }
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
