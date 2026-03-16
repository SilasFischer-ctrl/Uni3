package Übung4;

public class P3_main {
    public static void main(String[] args) {

        boolean x, y;
        //a) !(x!=y && x==y)
        x = true;
        y = true;
        System.out.println(!(x != y && x == y));

        x = true;
        y = false;
        System.out.println(!(x != y && x == y));

        x = false;
        y = true;
        System.out.println(!(x != y && x == y));

        x = false;
        y = false;
        System.out.println(!(x != y && x == y));

        //b) x || true
        x = true;
        y = true;
        System.out.println(x || true);

        x = true;
        y = false;
        System.out.println(x || true);

        x = false;
        y = true;
        System.out.println(x || true);

        x = false;
        y = false;
        System.out.println(x || true);

        //c) x && false
        x = true;
        y = true;
        System.out.println(x && false);

        x = true;
        y = false;
        System.out.println(x && false);

        x = false;
        y = true;
        System.out.println(x && false);

        x = false;
        y = false;
        System.out.println(x && false);

        //d) (x&&!y) || (!x)
        x = true;
        y = true;
        System.out.println((x&&!y) || (!x));

        x = true;
        y = false;
        System.out.println((x&&!y) || (!x));

        x = false;
        y = true;
        System.out.println((x&&!y) || (!x));

        x = false;
        y = false;
        System.out.println((x&&!y) || (!x));

    }
}