import java.util.*;
class Test25
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		System.out.println("size:"+v.size());
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		v.addElement("D");
		v.addElement("E");
		System.out.println(v);
		System.out.println("size:"+v.size());
		System.out.println("capacity:"+v.capacity());
		Enumeration e1=v.elements();
		while (e1.hasMoreElements())
		{
			String s=(String)e1.nextElement();
			System.out.println(s);
		}
		for(Object ob:v)
		{
			System.out.println(ob);	
		}
	}
}
