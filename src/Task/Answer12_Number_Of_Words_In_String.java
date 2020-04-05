
package Task;

import java.util.Scanner;

/**
 *
 * @author Sunny
 */
public class Answer12_Number_Of_Words_In_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String to find the number of words");
        a = s.nextLine();
        String[] word = a.split("\\s+");
        System.out.println("The number of words in the string are " +word.length);
        
      
        
        
    }
    
}
