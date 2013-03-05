/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Objects;

/**
 *
 * @author jryder
 */
public class Dog {
    private String name;
    private int age;
    private String rab;

    
    @Override
    public String toString(){
        return getName() + " is " + String.valueOf(getAge()) + " years old";
    }
    
    
    public String getRab() {
        return rab;
    }

    public void setRab(String rab) {
        this.rab = rab;
    }

    public Dog(String name, int age, String rab){
        this.age = age;
        this.name = name;
        this.rab = rab;
    
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.rab);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.rab, other.rab)) {
            return false;
        }
        return true;
    }
    
    

    
    
}
