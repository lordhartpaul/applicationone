import java.util.Scanner;

public class Armstrong
{
    public static void main(String args[])
    {
        int no, copy, re, ans=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a Armstrong or not");
        no = input.nextInt();
        copy = no;
        while(copy!=0)
        {
            re = copy % 10;
            ans = ans + (re*re*re);
            copy = copy/10;
        }
        if(ans == no)
        {
            System.out.println("The number is Armstrong");
        }
        else
        {
            System.out.println("The number is not a Armstrong");
        }
    }
}