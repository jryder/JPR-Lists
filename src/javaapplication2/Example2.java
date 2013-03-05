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
public class Example2 {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Moe", 3,"A1");
        Dog dog2 = new Dog("Larry", 2,"A3");
        Dog dog3 = new Dog("Moe", 3,"A1");

        if(dog1.equals(dog3)){
            System.out.println("Dog 1 and 3 are Equal");
        } else {
            System.out.println("They are not equal");
        }
        List<Dog> dogs = new ArrayList();

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        
        System.out.println(dogs.size());

        TreeSet<Dog> l = new TreeSet();
        
       // l.addAll(dogs);
       // System.out.println(l.size());
        
    }
}
