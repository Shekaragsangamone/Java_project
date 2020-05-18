 import java.util.*;  
class Test26
{  
 public static void main(String args[])
 {  
  HashSet h1=new HashSet();  
  h1.add("GHI"); 
  h1.add("ABC");  
  h1.add("DEF");  
  System.out.println(h1.add("GHI"));// false  
  
  Iterator itr=h1.iterator();  
  while(itr.hasNext()){
   String s=(String)itr.next();	  
   System.out.println(s);  
  }  
 }  
}