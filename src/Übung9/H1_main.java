package Übung9;

import java.util.ArrayList;

public class H1_main {
    public static void main (String[] args){
        ArrayList<Patient> patient = new ArrayList<Patient>();
        Patient p1 = new Patient("Anna", 3);
        Patient p2 = new Patient("Ben", 1);
        Patient p3 = new Patient("Clara", 5);

        patient.add(p1);
        patient.add(p2);
        patient.add(p3);

        for (int i = 0; i < patient.size(); i++){
            System.out.print(patient.get(i).name + " ");
            System.out.println(patient.get(i).prio);
        }
    }
}