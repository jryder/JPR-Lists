/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.*;

/**
 *
 * @author jryder
 */
public class Example3 {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Moe", 3, "A1");
        Dog dog2 = new Dog("Larry", 2, "A3");
        Dog dog3 = new Dog("Moe", 3, "A1");
        
        
        List<Dog> dogs = new ArrayList();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs.size());
        
        Set dogSet = new HashSet(dogs);
        
        System.out.println(dogSet.size());
        dogs = new ArrayList(dogSet);
        
    }
}
