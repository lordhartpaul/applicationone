
public class reversesentence {

   
    public static void main(String[] args){
        // TODO code application logic here
        
        String s = " Hello i am sunny";
         
        String p = " ";
     
        String word[] = s.split(" ");
        
        for(int i=0;i<word.length;i++)
        {
            if(i==word.length-1)
            {
                p = word[i] + p;
            }
            
            else
            {
                p = " " + word[i] + p;
                       
            }
        }
        
        System.out.println(p);
        
        
    }
    
}
