
public class reversestring {

    
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer s = new StringBuffer("hello i am sunny");
       int n = s.length();
       String s1 = " ";
       for(int i = n-1;i>=0;i--)
       {
           s1 = s1 + s.charAt(i);
       }
     System.out.println(s1);
       
        
        
    }
    
}
