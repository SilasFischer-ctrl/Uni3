package Übung5;

public class H1_main {
    public static void main (String[] args){

        int [] myarray = {5,6,7,10};

        for (int i = 0; i < myarray.length/2; i++){
            int temp = myarray[i];
            myarray[i] = myarray[(myarray.length - 1) - i];
            myarray[(myarray.length - 1) - i] = temp;
        }
        for (int i = 0; i < myarray.length; i++){
            System.out.print(myarray[i] + " ");
        }

    }
}
