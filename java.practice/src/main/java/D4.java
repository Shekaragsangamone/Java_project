
import java.util.Scanner; 
class D4
{
	public static void main(String args[])
	{
		int id[]=new int[5];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<5;i++) 
		{
			System.out.println("enter id");
			id[i]=sc.nextInt();
		}

		System.out.println("show id");
		for(int i=0;i<5;i++)
		{
			System.out.println(id[i]);
		}
	}
}