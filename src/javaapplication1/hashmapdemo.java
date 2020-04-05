
package javaapplication1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class hashmapdemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<String, Double> hm = new HashMap();
        hm.put("Rohit", new Double(233.3));
        hm.put("Raina", new Double(677.1));
        hm.put("Ashwin", new Double(121.4));
        hm.put("Suresh", new Double(-98.7));
        
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        
        for(Map.Entry<String, Double> me : set)
        {
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
        
        System.out.println("After removing");
        hm.remove("Raina");
        
        for(Map.Entry<String, Double> me : set)
        {
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
        
        
        System.out.println("After updating");
        Double balance = hm.get("Rohit");
        hm.put("Rohit", balance + 500);
        System.out.println("Rohit new balance :" +hm.get("Rohit"));

       for(Map.Entry<String, Double> me : set)
        {
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
        
        
    }
    
}
