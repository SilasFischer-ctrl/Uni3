package Übung2;

public class H3_main {
    public static void main (String[] args){

        int i=140, j=150, k=-10;
        boolean ausdruck1 = false, ausdruck2 = false, ausdruck3 = false;

        //Ausdruck 1
        if (i>j) ausdruck1 = true;
        //Ausdruck 2
        if (i>200) ausdruck2 = true;
        //Ausdruck 3
        if (j>100) ausdruck3 = true;

        if (ausdruck1){
            if (!ausdruck2 && !ausdruck3){
                k=1;
            }
            if (ausdruck2 && !ausdruck3){
                k=2;
            }
            if (ausdruck2 && ausdruck3){
                k=3;
            }
        } else if (!ausdruck1 && !ausdruck2 && !ausdruck3) {
            k=4;
        }
        System.out.println(k);
    }
}
