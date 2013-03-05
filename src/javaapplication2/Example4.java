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
public class Example4 {

    public static void main(String[] args) {
        List cars = new ArrayList();
        cars.add("Buick");
        cars.add("Dodge");
        cars.add("Gremlin");
        cars.add("Nova");


        for (int i = 0; i < cars.size(); i++) {
            String s = (String) cars.get(i);
            System.out.println(s);
        }



        Employee e1 = new Employee("Jordan", "BI");
        Employee e2 = new Employee("Joe", "Plumbing");
        Employee e3 = new Employee("George", "Latex Sales");

        List<Employee> l = new ArrayList();
        l.add(e1);
        l.add(e2);
        l.add(e3);

        for (Employee e : l) {
            String s = e.getName() + " works in " + e.getDepartment();
            System.out.println(s);
        }




        List nList = new ArrayList(l);
        Dog d1 = new Dog("Jim", 5, "A");
        Dog d2 = new Dog("Jack", 2, "C");
        Dog d3 = new Dog("Gary", 54, "B");

        nList.add(d1);
        nList.add(d2);
        nList.add(d3);

        for (int i = 0; i < nList.size(); i++) {
            Object o = nList.get(i);
            System.out.println(o.toString());
        }

        /*
          
         Now loop through the list and print out some meaningful information about each object. 
         What challenges does this present? 
         Polymorphism is broken, you can't use the class specific methods
         How can you overcome these challenges?
         My way is to use the toString method.  
         
         The other options would be to create if statements to check what type of object each of them is.  
         
         The other option would be to create separate lists.  
            
         */
    }
}
