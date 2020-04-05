
public class reverseword {

    
    public static void main(String[] args) {
        // TODO code application logic here
       String s = "Hello i am sunny";
        
       StringBuffer p = new StringBuffer();
       
       String words[] = s.split(" ");
       
       for(String word : words)
       {
           String d = new StringBuffer(word).reverse().toString();
           p.append(d + " ");
       }
       System.out.println(p.toString().trim());
    
}
}
