 import java.util.*;  
public class Test237{  
 public static void main(String args[]){  
  Employe e1=new Employe(501,"Raj",4000);  
  Employe e2=new Employe(502,"David",5000);  
  ArrayList al=new ArrayList(); 
  al.add(e1);  
  al.add(e2);  
    
  Iterator itr=al.iterator();   
  while(itr.hasNext()){  
    Employe e=(Employe)itr.next();  
    System.out.println(e.id+" "+e.name+" "+e.salary);  
  }
 }  
}  
