
package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class hashmapdemo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("Raina", new Double(334.2));
        hm.put("Rohit", new Double(221.9));
        hm.put("Suresh", new Double(-97.6));
        
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        
        for(Map.Entry<String, Double> me : set)
        {
            System.out.print(me.getKey()+ ":");
            System.out.println(me.getValue());
        }
        
        System.out.println("After removing");
        hm.remove("Raina");
        
         for(Map.Entry<String, Double> me : set)
        {
            System.out.print(me.getKey()+ ":");
            System.out.println(me.getValue());
        }
        
         System.out.println("After updating");
         Double balance = hm.get("Rohit");
         hm.put("Rohit", balance + 50);
         System.out.println("Rohit's new balance :" +hm.get("Rohit"));
         for(Map.Entry<String, Double> me : set)
        {
            System.out.print(me.getKey()+ ":");
            System.out.println(me.getValue());
        }
         
    }
    
}
