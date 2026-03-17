package Übung8;

public class P3_main {
    public static void main (String[] args){
        int [] a = {1,2};
        int [] b = {2,-1};
        int [] test = elementwiseMultiply(a,b);
        for (int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }
        boolean orthogonal = areOrthogonal(a,b);
        System.out.println(orthogonal);
    }

    public static int[] elementwiseMultiply(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            int [] result = {};
            return result;
        }
        int[] result = new int [arr1.length];
        for (int i = 0; i < arr1.length; i++){
            result [i] = arr1[i] * arr2[i];
        }
        return result;
    }

    public static boolean areOrthogonal(int[] arr1, int[] arr2){
        int sum = 0;
        int [] multiplied = elementwiseMultiply(arr1,arr2);
        for (int i = 0; i < multiplied.length; i++){
            sum = sum + arr1[i] * arr2[i];
        }
        if (sum != 0 ){
            return false;
        } else return true;
    }
}
