
package Task;

import java.util.Scanner;

/**
 *
 * @author Sunny
 */
public class Answer11_Swap_Two_Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a,b;
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = s.nextInt();
        System.out.println("Enter the value of b");
        b = s.nextInt();
        System.out.println("The value of a is "+a+ " and b is " +b);
        //Swapping without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping the value of a is " +a+ "and b is " +b);
        
        
    }
    
}
