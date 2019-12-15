import java.util.Scanner;

public class Prime
{
    public static void main(String args[])
    {
        int n,m,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        n = input.nextInt();
        m=n/2;
       
        for(int i=2;i<=m;i++)
        {
           if(n%i==0)
           {
               sum=1;
               break;
           }
        }
        if(n==1)
        {
            System.out.println("The number 1 is neither a prime nor a composite ");
        }
        else
        {
            if(sum==0)
            {
                System.out.println("The number is a prime");
                
            }
            else
            {
                System.out.println("The number is a composite");
            }
        }
    }
}



