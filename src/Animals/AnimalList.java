/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import Lists.List;
import java.util.Arrays;





/**
 *
 * @author HP I3
 */
public class AnimalList implements List<Animal> {
    
    
    private Animal animals[];

   public boolean add(Animal animals) {
        if (animals == null) {
        return false;
    }
    for (int i = 0; i < animals.length; i++) {
        if (animal[i] == null) {
            animals[i] = animals;
            return true;
        }
    }
    return false;
    }

    @Override
    public boolean remove(Animal Animals) {
        if (animals == null) return false;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].equals(animals)) {
                for (int j = i; j < animals.length - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animals.length - 1] = null; 
                return true;
            }
        }
        return false; 
    }

    @Override
    public Animal find(Object Visitor) {
        if (animals == null) return null;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].equals(Visitor)) {
                return animals[i];
            }
        }

        return null;
    }

    @Override
    public void showAll() {
       System.out.println(Arrays.toString(animals));
    }
    
}


   

    
    

