import java.util.*;
class Test270
{
	public static void main(String args[])
	{
		HashMap hm=new HashMap();
		hm.put("001","John");
		hm.put("002","Robert");
		hm.put("003","Mac");
		hm.put("004","David");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("100"));
		System.out.println(hm.containsValue("Dav"));
		System.out.println(hm.get("004"));


		Set sk=hm.keySet();
		Iterator ktr=sk.iterator();
		System.out.println("----Keys----");
		while(ktr.hasNext())
		{
			System.out.println(ktr.next());
		}
		Collection c=hm.values();
		Iterator vtr=c.iterator();
		System.out.println("----Values----");
		while(vtr.hasNext())
		{
			System.out.println(vtr.next());
		}
	}
}