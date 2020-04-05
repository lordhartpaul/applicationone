
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class duplicatekeyduplicatevalue {
    
    public static class Item {

public String name;

public int quantity;

public Item()
{
    
}

public Item(String p, int s)
{
    name = p;
    quantity = s;
}

public String getName() {
    return name;
   }

public void setName(String name) {
    this.name = name;
   }

public int getQuantity() {
    return quantity;
   }

public void setQuantity(int quantity) {
    this.quantity = quantity;
   }
    }


    public static void main(String args[]){
   
     List<Item> items = new ArrayList<Item>();
     items.add(new Item("banana",20));
      items.add(new Item("banana",60));
       items.add(new Item("apple",20));
     
                
     Map<String, Integer> sum = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQuantity)));

  System.out.println(sum);
 
 
 
 
    } 
}
