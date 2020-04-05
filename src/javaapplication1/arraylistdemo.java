
package javaapplication1;

import java.util.ArrayList;


public class arraylistdemo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> a = new ArrayList();
        a.add("red");
        a.add("green");
        a.add("blue");
        
        for(String x : a)
        {
            System.out.println(""+x);
        }
        
        a.remove(1);
        
        System.out.println("after removing");
        
        for(String x : a)
        {
            System.out.println(""+x);
        }
        
        a.clear();
        
        System.out.println("after clearing");
        
        for(String x : a)
        {
            System.out.println(""+x);
        }
    }
    
}




