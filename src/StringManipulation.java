import java.util.*;
import java.lang.*;
import java.io.*;

public class StringManipulation
{
    public static void main(String args[])
    {
        int n,out;
        String s;
        String m = "Paul";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String of character");
        s = input.next();
        System.out.println("Enter your choice 1.Concat 2. compare 3.equals 4.split 5.length 6.replace 7.reverse 8.substring 9.CharAt 10. uppercase 11.lowercase 12.trim 13.comma ");
        n = input.nextInt();
        switch(n)
                {
            case 1:  System.out.println("Concatenate String " +s.concat(m));
            break;
            case 2: out = s.compareTo(m);
                    System.out.println("If s = m" +out);
            break;
            case 3: Boolean out1 = s.equals(m);
                    System.out.println("Checking Equality " +out1);
            break;
            case 4: String[] p = s.split("u",2);
                    for(String a : p)
                    System.out.println(a);
            break;
            case 5: System.out.println("String length" +s.length());
            break;
            case 6: String m1 = s.replace('u', 'o');
                    System.out.println("Modified String is " +m1);
            break;
            case 7: StringBuffer s1 = new StringBuffer("Pendrive");
                    s1.reverse();
                    System.out.println("Reverse String is " +s1);
            break;
            case 8: System.out.println("Substring " +s.substring(3));
            break;
            case 9: System.out.print("Character at 3rd Position" +s.charAt(3));
            break;
            case 10: System.out.println("Uppercase is" +s.toUpperCase());
            break;
            case 11: System.out.println("Lowercase is" +s.toLowerCase());
            break;
            case 12: System.out.println("Trimmming removes white spaces at end and start is" +s.trim());
            break;
            default : System.out.println("Please enter a valid choice");
            break;
                    
            
             
          
                }
    }
}