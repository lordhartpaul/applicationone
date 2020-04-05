
package Practice;

import java.util.ArrayList;


public class arraylistdemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> a = new ArrayList<String>();
        a.add("red");
        a.add("green");
        a.add("blue");
        
        for(String me : a)
        {
            System.out.println("" +me);
        }
        
        System.out.println("After removing");
        
        a.remove(0);
        for(String me : a)
        {
            System.out.println("" +me);
        }
        System.out.println("After Clearing");
        
        a.clear();
        for(String me : a)
        {
            System.out.println("" +me);
        }
        
    }
    
}
