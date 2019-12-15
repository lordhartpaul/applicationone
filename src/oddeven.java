import java.util.Scanner;

public class oddeven
{
    public static void main(String args[])
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is odd or even");
        num = input.nextInt();
        input.close();
        if(num%2==0)
        {
            System.out.println("The number is Even number");
        }
        else
        {
            System.out.println("The number is Odd number");
        }
    }
}