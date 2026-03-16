package Übung4;

public class H3_main {
    public static void main (String[] args){

        float celsiusFloat = 14.2F, fahrenheitFloat = 100.0F;
        double celsiusDouble = 14.2, fahrenheitDouble = 100.0;

        fahrenheitFloat = (celsiusFloat * (9.0F/5.0F)) + 32;
        fahrenheitDouble = (celsiusDouble * (9.0/5.0)) + 32;

        System.out.println(fahrenheitFloat);
        System.out.println(fahrenheitDouble);
    }
}
