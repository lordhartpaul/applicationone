
package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class comparabledemo {

 public static void main(String[] args) {
        // TODO code application logic here
        List<Laptop> a1 = new ArrayList<Laptop>();
        a1.add(new Laptop("Acer", 520));
        a1.add(new Laptop("Lenovo", 312));
        a1.add(new Laptop("Dell", 790));
        
        Collections.sort(a1);
        for(Laptop me : a1)
        {
            System.out.println(me);
        }
        
    }
}
        
        
    

