package Klassen;

public class Mensch {
    public String name;
    public int gebJahr=0;
    public int alter=0;

    public void setName(String s){
        this.name = s;
    }
    public void setGebJahr(int a){
        this.gebJahr = a;
    }
    public void setAlter(){
        this.alter = 2026 - gebJahr;
    }
    public String getName(){
        return name;
    }
    public int getGebJahr(){
        return gebJahr;
    }
    public int getAlter(){
        return alter;
    }
}
