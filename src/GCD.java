import java.util.Scanner;

public class GCD
{
    public static void main(String args[])
    {
        int a,b,rem,temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number a and b");
        a = input.nextInt();
        b = input.nextInt();
        if(b==0)
        {
            System.out.println( "GCD of a.b is" +a);
            
        }
        else if(a<b)
        {
            temp = b;
            rem = temp % a;
            while(rem!=0)
            {
                temp = a;
                a = rem;
                rem = temp % a;
            }
            System.out.println("GCD of a,b is" +a);
        }
        else if(a>b)
        {
            rem = a % b;
            while(rem != 0)
            {
                a = b;
                b = rem;
                rem = a % b;
            }
            System.out.println("GCD of a,b is" +b);
        }
    }
}