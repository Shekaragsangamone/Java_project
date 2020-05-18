 import java.util.*;
class Test03{
public static void main(String[] args){
TreeSet ts=new TreeSet(new DescComparator());
ts.add(3);
ts.add(2);
ts.add(4);
ts.add(5);
ts.add(1);
System.out.println(ts);
}
}
class DescComparator implements Comparator
{
 public int compare(Object ob1,Object ob2) {
	 int x=(Integer)ob1;
              int y=(Integer)ob2;	 
      if(x>y)
	  return -1;
	  else if(y>x)
	  return 1;
	  else
	  return 0;
	  }
}