import java.util.Scanner;

public class leapyear
{
    public static void main(String args[])
    {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Eneter a year to check whether it is a leap year or not");
        year = input.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            System.out.println("The year is a leap year");
        }
        else
        {
            System.out.println("The year is not a leap year");
        }
            
    }
}