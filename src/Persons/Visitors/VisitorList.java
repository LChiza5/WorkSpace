/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;

import Lists.List;
import java.util.Arrays;

/**
 *
 * @author Luisk
 */
public class VisitorList implements List<Visitor> {
    private Visitor visitors[];

    public VisitorList() {
        this.visitors = new Visitor[100];
    }

    @Override
    public boolean add(Visitor Visitor) {
        if (Visitor == null) {
        return false;
    }
    for (int i = 0; i < visitors.length; i++) {
        if (visitors[i] == null) {
            visitors[i] = Visitor;
            return true;
        }
    }
    return false;
    }

    @Override
    public boolean remove(Visitor Visitor) {
        if (Visitor == null) return false;
        for (int i = 0; i < visitors.length; i++) {
            if (visitors[i] != null && visitors[i].equals(Visitor)) {
                for (int j = i; j < visitors.length - 1; j++) {
                    visitors[j] = visitors[j + 1];
                }
                visitors[visitors.length - 1] = null; 
                return true;
            }
        }
        return false; 
    }

    @Override
    public Visitor find(Object Visitor) {
        if (Visitor == null) return null;

        for (int i = 0; i < visitors.length; i++) {
            if (visitors[i] != null && visitors[i].equals(Visitor)) {
                return visitors[i];
            }
        }

        return null;
    }

    @Override
    public void showAll() {
       System.out.println(Arrays.toString(visitors));
    }
}
