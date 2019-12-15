import java.util.Scanner;

public class Factorial
{
    public static void main(String args[])
    {
        int fact =1, i=1, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        n = input.nextInt();
        do
        {
            fact *= i;
            i++;
        }
        while(i<=n);
        System.out.println("The factorial is" +fact);
    }
}