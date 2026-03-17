package Übung6REP;

public class P2_main {
    public static void main (String[] args){
        int [] a = {7,3,4,3};
        boolean test;
        test = pairweiseDifferent(a);
        System.out.println(test);
    }

    public static boolean pairweiseDifferent (int[] someNumbers){
        for (int i = 0; i< someNumbers.length; i++){
            for (int j = i+1; j<someNumbers.length; j++){
                if (someNumbers[i] == someNumbers[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
