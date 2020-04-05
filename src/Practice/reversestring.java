
package Practice;

import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class reversestring {
    
    public static class Player
    {
        int score;
        String name;
        public Player(int n, String s)
        {
            score = n;
            name = s;
            
        }
    }
    public static class getbyscore implements Comparator<Player>
    {
        public int compare(Player o1, Player o2)
        {
            return o1.score - o2.score;
        }
    }
    
   public static void main(String args[])
    {
        
       ArrayList<Player> hm = new ArrayList<Player>();
       hm.add(new Player(223,"Rohit"));
        hm.add(new Player(221,"Rohit"));
        Collections.sort(hm, new getbyscore());
        
        for(int i=0; i<hm.size();i++)
        {
       System.out.println(hm.get(i).score+ " "+hm.get(i).name);
        }
       
       
   
        
    }

   
}
