 import java.util.*;
class Test24
{
public static void main(String[] args){
LinkedList l=new LinkedList();
l.add(10);
l.add(20);
l.add(30);
l.add("Mac");
l.add(40);
l.add(50);
l.add("RAJ");
l.addFirst("John");
l.addLast("David");
System.out.println("elements :"+l);
System.out.println(l.size());
//remove element from LinkedList
l.remove("RAJ");
//l.remove(20);//it will try to remove the element of 20th index.
//and throw IndexOutOfBoundsException.//l.remove(2);
System.out.println("elements after deletion:"+l);
//remove element from 0th index
l.remove(0);
System.out.println("elements after deletion:"+l);
//remove first and last elements
l.removeFirst();
l.removeLast();
System.out.println(l);
Iterator itr=l.iterator();
while(itr.hasNext()){
	Object obj=itr.next();
	System.out.println(obj);
}
}
}