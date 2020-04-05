
package javaapplication1;

import java.util.Scanner;


public class comparabledemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
          System.out.println("Enter the number of names to sort");
       int n = s.nextInt();
        String name[] = new String[n];
       
        Scanner s1 = new Scanner(System.in);
        
      
        System.out.println("Enter the names");
        for(int i=0;i<n;i++)
        {
            name[i] = s1.nextLine();
        }
        
        for(int i=0; i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(name[i].compareTo(name[j])>0)
                {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        
        System.out.println("After sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(name[i]);
        }
    }
    
}
