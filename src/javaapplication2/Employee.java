/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author jryder
 */
public class Employee {

     private String name;
     private String department;

     public Employee(String n, String d){
        name = n;
        department = d;
}
     
     
    @Override
    public String toString(){
        return getName() + " works in " + getDepartment();
    } 
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
     
}
