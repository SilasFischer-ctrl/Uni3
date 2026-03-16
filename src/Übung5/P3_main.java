package Übung5;

public class P3_main {
    public static void main (String[] args){

        int a [][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        //Aufgabe a)
        /*
        for (int i = 0; i< a.length;i++){
            for (int j = 0; j< a[i].length;j++){
                a[i][j] = a[i][j] + 1;
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
        */

        //Aufgabe b)
        /*
        int summe=0;
        for (int i = 0; i< a.length;i++){
            for (int j = 0; j< a[i].length;j++){
                summe = summe + a[i][j];
            }
        }
        System.out.println(summe); */

        for (int j = 0; j<a.length ;j++){
            for (int i = a.length - 1; i >=0 ;i--){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
