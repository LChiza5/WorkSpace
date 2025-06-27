/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;

import Lists.List;
import java.util.Arrays;

/**
 *
 * @author ilope
 */
public class VisitList implements List<Visit> {
    private Visit visits[];

    public VisitList() {
        this.visits = new Visit[100];
    }

    @Override
    public boolean add(Visit Visit) {
       if (find(Visit) != null) {
        return false; 
    }
    for (int x = 0; x < visits.length; x++) {
        if (visits[x] == null) {
            visits[x] = Visit;
            return true; 
        }
    }
    return false; 
}

    @Override
     public boolean remove(Visit visit) {
        for (int x = 0; x < visits.length; x++) {
            if (visits[x] != null && visits[x].equals(visit)) {
                visits[x] = null; 
                return true;
            }
        }
        return false; 
    }

    @Override
    public Visit find(Object Visit) {
        for (int x = 0; x < visits.length; x++) {
            if (visits[x] != null && visits[x].equals(Visit)) {
                return visits[x]; 
            }
        }
        return null; 
    }
    

    @Override
    public void showAll() {
        System.out.println(Arrays.toString(visits));
    }
    
}
