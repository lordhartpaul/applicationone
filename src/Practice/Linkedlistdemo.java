
package Practice;

import java.util.LinkedList;


public class Linkedlistdemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList list = new LinkedList();
        
        list.add(2);
        list.add(7);
        list.add(9);
       list.addFirst(10);
       
      for(Object me : list)
      {
        System.out.println(""+me);  
      }
      
      list.set(1, 5);
      for(Object me : list)
      {
        System.out.println(""+me);  
      }
       
    }
    
}
