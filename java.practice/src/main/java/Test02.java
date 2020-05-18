import java.util.*;
class Employee implements Comparable
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+"  "+name;
	}

	public int compareTo(Object o)
	//comparision based on id
	{
		Employee e=(Employee)o;
		if(this.id==e.id)  
			return 0;  
		else if(this.id>e.id)  
			return 1;  
		else  
			return -1;
	}
}
class Test02
{
	public static void main(String[] args){
		TreeSet ts=new TreeSet();
		ts.add(new Employee(20,"David"));
		ts.add(new Employee(19,"John"));
		ts.add(new Employee(30,"Cena"));
		System.out.println(ts);
	}
}