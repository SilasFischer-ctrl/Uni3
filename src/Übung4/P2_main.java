package Übung4;

public class P2_main {
    public static void main(String[] args){

        int a=3, b=5, c=6;
        int intResult;
        double x=1.5, y=2.3;
        double doubleResult;

        intResult = c - a * 3;
        System.out.println(intResult);

        intResult = c / b;
        System.out.println(intResult);

        intResult = a + b / c;
        System.out.println(intResult);

        doubleResult = (double)c / b;
        System.out.println(doubleResult);

        doubleResult = c +(double) a / b;
        System.out.println(doubleResult);

        doubleResult = x + y * b;
        System.out.println(doubleResult);
    }
}
