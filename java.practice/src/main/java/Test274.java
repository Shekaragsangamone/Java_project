import java.util.Arrays;
class B implements Comparable
{
	int i;

	B(int i)
	{
		this.i=i;
	}

	public String toString()
	{
		return i+"";
	}

	public int compareTo(Object o)
	{
		B a=(B)o;
		if(this.i==a.i)  
			return 0;  
		else if(this.i>a.i)  
			return 1;  
		else  
			return -1;
	}
}


class Test274
{
	public static void main(String args[])
	{
		B a[]=new B[3];
		a[0]=new B(9);
		a[1]=new B(3);
		a[2]=new B(5);

		for(B a1:a)
		{
			System.out.println(a1);
		}
		System.out.println("..........");
		Arrays.sort(a);
		for(B a2:a)
		{
			System.out.println(a2);
		}
	}
}