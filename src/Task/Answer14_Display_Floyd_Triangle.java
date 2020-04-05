
package Task;

import java.util.Scanner;

/**
 *
 * @author Sunny
 */
public class Answer14_Display_Floyd_Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a, count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Eneter the number of rows which you want in your Floyd Triangle ");
        a = s.nextInt();
        for(int i=1; i<=a;i++)
        {
            for(int j = 1;j<=i;j++)
            {
               count = count + 1; 
               System.out.println(count);
               
            }
            System.out.println();
        }
        
    }
    
}
