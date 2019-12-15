import java.util.Scanner;

public class Fibonnaci
{
    public static void main(String args[])
    {
       int n,i=0,x1=0,x2=1,fib;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter tghe number of series");
       n = input.nextInt();
       if(n>1)
       {
           for(i=0;i<n;i++)
           {
               if(i<=1)
               {
                   fib = i;
               }
               else
               {
                   fib = x1 + x2;
                   x1 = x2;
                   x2 = fib;
               }
               System.out.println("" +fib);
           }
       }
    }
}