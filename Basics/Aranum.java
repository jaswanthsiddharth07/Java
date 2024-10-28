package practice;
import java.util.*;

public class Aranum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="peek";
		String s2="keep";
		if(s1.length()==s2.length())
		{
			char a[]= s1.toCharArray();
			char b[]= s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
		    boolean result=Arrays.equals(a,b);
			if(result)
			{
			System.out.println("Aragram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
		else
		{
			System.out.println("not aranum");
			
		}

	}

}
