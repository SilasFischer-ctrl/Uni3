package Übung3;

public class H3_main {
    public static void main (String[] args){

        int max = 5, fix = 2, wartend = 7;
        boolean istVoll = false;

        if (fix < max){
            if (wartend >= (max-fix)){
                wartend = wartend-(max-fix);
                fix = max;
                istVoll = true;
            } else {
                fix = fix + wartend;
                wartend = wartend - wartend;
                istVoll = false;
            }
        } else istVoll = true;
        System.out.println(max);
        System.out.println(fix);
        System.out.println(wartend);
        System.out.println(istVoll);
    }
}
