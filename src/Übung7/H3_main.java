package Übung7;

import Klassen.Mensch;

public class H3_main {
    public static void main (String[] args){
        Mensch m = new Mensch();
        m.setName("Silas");
        m.setGebJahr(2002);
        m.setAlter();
        System.out.println(m.getName());
        System.out.println(m.getGebJahr());
        System.out.println(m.getAlter());
    }
}
