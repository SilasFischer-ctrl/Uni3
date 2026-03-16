package Übung5;

public class H3_main {
    public static void main (String[] args){

        int [][] einheiten = {{50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1},
                                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
        int input = 6279;

        for (int j = 0; j< einheiten[0].length; j++){
            if ((input / einheiten[0][j]) >= 1){
                int temp = input / einheiten[0][j];
                einheiten[1][j] = temp;
                input = input - temp * einheiten[0][j];

                }
            }

        for (int i = 0; i< einheiten.length; i++){
            for (int j = 0; j< einheiten[i].length; j++){
                System.out.print(einheiten[i][j] + " ");
            }
            System.out.println();
        }
    }
}
