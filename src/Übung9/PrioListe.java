package Übung9;

import java.util.ArrayList;

public class PrioListe {
    ArrayList<Patient> myList = new ArrayList<Patient>();

    public void addPatient(Patient p){
        if (myList.isEmpty()){
            myList.add(p);
            return;
        }

        for (int i = 0; i < myList.size(); i++){
            if (p.prio < myList.get(i).prio){
                myList.add(i, p);
                return;
            }
        }
        myList.add(p);
    }

    public Patient getNextPatient(){
        if (myList.isEmpty()) return null;
        Patient next = myList.get(0);
        myList.remove(0);
        return next;
    }

    public int getPosition (Patient p){
        int position = myList.indexOf(p);
        return position;
    }
}
