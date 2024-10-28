 package practice;
 import java.util.*;

public class mapeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(123456, "asdfghj");
		m.put(2, "ytvvubhv");
	
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		Set<Integer> s=new HashSet<Integer>();
		s=m.keySet();
		for(int i:s)
		{
			System.out.println(m.get(i));
			System.out.println(i);
		}
		
		for(Map.Entry<Integer, String> n1: m.entrySet())
		{
			System.out.println(n1.getValue()+" "+n1.getKey());
		}
		

	}

}
