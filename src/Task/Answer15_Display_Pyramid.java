
package Task;

import java.util.Scanner;

/**
 *
 * @author Sunny
 */
public class Answer15_Display_Pyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many rows you want in your pyramid");
        a = s.nextInt();
        
        for(int i = 1;i<=a;i++)
        {
            for(int j = 1; j <= a - i;j++)
            
              System.out.println(" ");
            
            for(int n = i; n>=1;n--)
                System.out.println((n>=10)?" " +n : " " +n);
            
            for(int n=2; n<=i;n++)
                System.out.println((n>=10)?" " +n : " " +n);
            
            System.out.println();
            
        }
        
    }
    
}
