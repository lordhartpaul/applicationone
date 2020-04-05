
package javaapplication1;

import java.util.HashSet;


public class Hashsetdemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet<String> set = new HashSet<String>();
        
        set.add("red");
        set.add("green");
        set.add("blue");
        
        for(String me : set)
        {
            System.out.println("" +me);
            
        }
        
        set.remove("green");
        
        for(String me : set)
        {
            System.out.println("" +me);
            
        }
        
        set.clear();
        for(String me : set)
        {
            System.out.println("" +me);
            
        }
        
        
    }
    
}
