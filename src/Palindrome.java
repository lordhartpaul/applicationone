import java.util.*;

public class Palindrome
{
    public static void main(String args[])
    {
       String s, rev = "";
       int i;
       Scanner input = new Scanner(System.in);
       System.out.println("Entera a String");
       s = input.next();
       StringBuffer s1 = new StringBuffer(s);
       s1.reverse();
       System.out.println("Rerverse is " +s1);
       
       // Palindrom check
       
       int out = s.length();
       for(i = out - 1;i>=0; i--)
       {
           rev = rev + s.charAt(i);
       }
       if(s.equals(rev))
       {
           System.out.println("Is Palindrome" +s);
           
       }
       else
       {
           System.out.println("Not a Palindrome" +s);
       }
    }
}