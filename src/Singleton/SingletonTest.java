
package Singleton;


public class SingletonTest {

    
    public static void main(String[] args) {
        
        Printer p1 = Printer.getInstance();
        
        Printer p2 = Printer.getInstance();
        
        if(p1 == p2)
        {
            System.out.println("same");
        }
        else
        {
            System.out.println("Different");
        }
    }
    
}
