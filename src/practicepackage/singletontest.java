/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicepackage;

/**
 *
 * @author Sunny
 */
public class singletontest {

    /**
     * @param args the command line arguments
     */
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
            System.out.println("different");
        }
    }
    
}
