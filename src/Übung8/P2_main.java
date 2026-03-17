package Übung8;


public class P2_main {
    public static void main (String []args){
        String s = "RindfLeischetikETTierung";
        int test = 13;
        String t = new String();
        t = shortenToLowerCase(s,test);
        System.out.println(t);
    }

    public static String shortenToLowerCase(String input, int shortenBy){
        if (shortenBy >= input.length()) return "";

        String test = input.substring(0, input.length()-shortenBy);
        test = test.toLowerCase();
        return test;
    }
}
