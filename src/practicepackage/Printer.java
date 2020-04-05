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
public class Printer {
    
    private static Printer printer;
    private Printer()
            {
                
            }
    public static Printer getInstance()
    {
        if(printer == null)
        {
            printer = new Printer();
        }
        return printer;
    }
    
}
