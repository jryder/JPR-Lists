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
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        test();
        
            
        /*
        List<String> groceryList = new ArrayList<String>();


        groceryList.add("Beer");
        groceryList.add("Pizza");
        groceryList.add("Cheese");
        
        String item = groceryList.get(2);
        System.out.println(item);
        
        groceryList.remove(1);
        item = groceryList.get(1);       
        System.out.println(item);
        
        
        for(int i = 0;i < groceryList.size();i++){
            String s = (String)groceryList.get(i);
            System.out.println(s);
        }
        
        
        for (String s: groceryList){
            System.out.println(s);
        }
        */
        
        
        /*
        List groceryList2 = new ArrayList();       
        groceryList2.add("Beer");
        groceryList2.add("Pizza");
        groceryList2.add("Cheese");
        
        
        
        String item2 = (String)groceryList2.get(0);
        System.out.println(item2);        
        */
        
    }
    
    
    public static void test(){
    
        List<String> l = new ArrayList();
        
        Set<String> set = new TreeSet();
    
        l.add("1");  
        
        set.addAll(l);
        
      
        //create massive list :D
        for(int i = 0;i < 2;i++){
            l.addAll(l.size(),l);
        }         
        
        
        //number all of the items in the list
        for (int i = 0;i < l.size();i++){
            l.set(i, String.valueOf(i));
        }
        
        
        for(String s:l){
            System.out.println(s);
        } 
        
        /*
        for(int i = 0;i < 5;i++){
            System.out.println("");
        }          
        
         
        for(String s:set){
            System.out.println(s);
        }
        */
        

        
        
        
        
    }
    
    
    
    
    
}
