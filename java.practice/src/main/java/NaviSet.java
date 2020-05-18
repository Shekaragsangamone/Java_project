

import java.util.*;
class NaviSet
{
	public static void main(String args[])
	{
		TreeSet ts=new TreeSet();
		ts.add(1);
		ts.add(20);
		ts.add(12);
		ts.add(9);
		ts.add(6);
		System.out.println(ts);
		System.out.println("--------------");
		Set st1=ts.descendingSet();
		System.out.println(st1);
		System.out.println("Ascending order");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Descending order");
		Iterator itr1=ts.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}}}