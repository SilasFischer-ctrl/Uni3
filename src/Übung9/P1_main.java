package Übung9;
import java.util.Random;

public class P1_main {
    public static void main (String[] args){
    }

    public static int[] randomArray (int x){
        Random r = new Random();
        int [] array = new int[x];

        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt();
        }
        return array;
    }

    public static int[] randomArray2 (int x){
        Random r = new Random();
        int [] array = new int[x];

        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(0,x);
        }
        return array;
    }

    public static int[] randomArray3 (){
        Random r = new Random();
        int [] array = new int[6];

        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(55,76);
        }
        return array;
    }

    public static int[] randomArray4 (int n){
        Random r = new Random();
        int [] array = new int[n+1];
        int sum = 0;
        for (int i = 0; i < n; i++){
            array[i] = r.nextInt(1,51);
            sum = sum + array[i];
        }
        array[n] = sum / (array.length - 1);

        return array;
    }
}
