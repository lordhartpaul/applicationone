import java.util.Scanner;

public class Perfectnumber
{
public static void main(String args[])
{
int number,r,i,sum=0;
Scanner input = new Scanner(System.in);
System.out.println("Enter a number");
number = input.nextInt();
for(i=1;i<number;i++)
{
    r = number % i;
    if(r == 0)
    {
        sum = sum + i;
    }
}
if(sum == number)
{
    System.out.println("The number is a Perfect number");
}
else
{
    System.out.println("The number is not a Perfect number");
}
}
}