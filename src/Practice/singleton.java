
package Practice;


public class singleton {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Printer p1 = Printer.getInstance();
        Printer p2 = Printer.getInstance();
        
        if(p1==p2)
        {
            System.out.println("same");
        }
        
        else
        {
            System.out.println("Different");
        }
    }
    
}
