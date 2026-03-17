package Übung7;
import Klassen.LetterGame;

public class P2_main {
    public static void main (String[] args){
        LetterGame l = new LetterGame();
        int [] a = {14,2,0,0,19,19};
        l.setWord(a);
        System.out.println(l.word);
        l.findCode("UNI");
        for (int i = 0; i < l.a.length; i++){
            System.out.print(l.a[i] + " ");
        }
    }
}
