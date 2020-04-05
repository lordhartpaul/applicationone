
package Task;

import java.util.Scanner;

/**
 *
 * @author Sunny
 */
public class Answer13_Remove_White_Spaces_In_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a, c= " ";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String to remove all white spaces");
        a = s.nextLine();
        char b[] = a.toCharArray();
        for(int i=0;i<b.length;i++)
        {
            if(b[i] != ' ')
            {
                c = c + b[i];
            }
        }
        
        System.out.println("After removing all white spaces the string is " +c);
        
    }
    
}
