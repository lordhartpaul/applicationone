
import java.util.ArrayList;
import java.util.Arrays;


public class sortarray {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(99);
        n.add(2);
         n.add(87);
          n.add(52);
        
        Object[] objects = n.toArray();
        
        int i = objects.length;
        
        Arrays.sort(objects);
        
       for(int j=0;j<i;j++)
           
       {
           System.out.println(objects[j]);
       }
    }
    
}
