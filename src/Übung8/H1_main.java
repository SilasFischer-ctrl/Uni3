package Übung8;

public class H1_main {
    public static void main (String[] args){
        Bruch b1 = new Bruch(5,3);
        Bruch b2 = new Bruch(15,9);

        boolean test = b1.hasSameValueAs(b2);
        System.out.println(test);
    }


}
