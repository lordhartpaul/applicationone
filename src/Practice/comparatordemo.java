
package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class comparatordemo {
    
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
    
    public static class sortbyscore implements Comparator<Player>
    {
        public int compare(Player o1, Player o2)
        {
            return o1.score - o2.score;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Player> a1 = new ArrayList<Player>();
        a1.add(new Player(234,"rohit"));
        a1.add(new Player(-97,"raina"));
        a1.add(new Player(120,"suresh"));
        
        Collections.sort(a1,new sortbyscore());
        for(int i=0;i<a1.size();i++)
        {
            System.out.println(a1.get(i).score+" " +a1.get(i).name);
        }
        
    }
    
}
