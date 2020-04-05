
package Practice;

class Emp{

int eid;
int salary;
static String ceo;


static
{
    ceo = "navin";
}


public Emp()
{
    eid = 3;
    salary = 3000;
    
}

public void show(){
    System.out.println(eid+ ":" +salary +":"  +ceo);
}

}




public class staticdemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Emp navin = new Emp();
        
        
        Emp rahul = new Emp();
       
            navin.show();
        rahul.show();
        
        
    }
    
}
