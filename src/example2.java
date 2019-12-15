import java.util.Scanner;
public class example2
{
    public static void main(String args[])
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr the number ");
        number = input.nextInt();
        input.close();
        number = number *2;
        System.out.println("The multiplication of number is " +number);
        
    }
}
