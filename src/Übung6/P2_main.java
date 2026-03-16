package Übung6;

public class P2_main {
    public static void main (String[] args){
        int [] a = {7,3,4,3};
        boolean b = pairwiseDifferent(a);
        System.out.println(b);
    }

    public static boolean pairwiseDifferent (int [] someNumbers){
        for (int i = 0; i< someNumbers.length; i++){
            int temp = someNumbers[i];
            for (int j = i + 1; j < someNumbers.length; j++){
                if (temp == someNumbers[j]){
                    return false;
                }
            }
        }
        return true;
    }

}
