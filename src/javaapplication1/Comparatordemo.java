
package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Comparatordemo {

    public static class Player
    {
        int score;
        String name;
        
        
        public Player(int s, String t)
        {
            score = s;
            name = t;
        }
    }
    
    public static class sortbyscore implements Comparator<Player>
    {
        public int compare(Player o1, Player o2)
        {
            return o1.score - o2.score;
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Player> a1 = new ArrayList<Player>();
        
        a1.add(new Player(54, "Rohit"));
        a1.add(new Player(21, "raina"));
        a1.add(new Player(76,"suresh"));
        
        Collections.sort(a1, new sortbyscore());
        for(int i=0; i< a1.size(); i++)
        {
            System.out.println(a1.get(i).score+ "  "+a1.get(i).name);
        }
        
    }
    
}
