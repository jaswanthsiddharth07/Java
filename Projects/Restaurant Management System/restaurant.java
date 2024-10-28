package food;
import java.util.*;
import java.util.Scanner;
public class restaurant {
	static final String ownerusername="jaswanth";
	static final String ownerpassword="********";
	HashMap<String,Integer> menu=null;
	restaurant()
	{
		menu=new HashMap<String,Integer>();	
	}
	Scanner sc=new Scanner(System.in);
	void Additem()
	{
		System.out.print("How many items to Add : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sc.nextLine();
			System.out.print("Enter food item : ");
			String name=sc.nextLine().toLowerCase();
			System.out.print("Enter price : ");
			int price=sc.nextInt();
			menu.put(name, price);	
		}
	}
	void Displaymenu()
	{
		Set<String> s=new HashSet<>();
		s=menu.keySet();
		System.out.println("Food"+"\t\t" +"Price ");
		for(String fooditem:s)
		{
			System.out.println(fooditem +"\t\t"+menu.get(fooditem));
		}
		
		
	}
	void Updateprice()
	{
		System.out.print("Enter item to update price : ");
		String itemupdate =sc.nextLine().toLowerCase();
		if(menu.containsKey(itemupdate))
		{
			System.out.print("Enter price : ");
			int newprice =sc.nextInt();
			sc.nextLine();
			menu.replace(itemupdate, newprice);
			System.out.println(itemupdate +" price updated to " +newprice);
		}
		else
		{
			System.out.println("Item not found in the menu");
		}
	}
	void Deleteitem()
	{
		System.out.println("Enter item to delete : ");
		String deleteitem=sc.nextLine().toLowerCase();
		if(menu.containsKey(deleteitem))
		{
			menu.remove(deleteitem);
			System.out.println(deleteitem + " has been removed from the menu");
			
		}
		else
		{
			System.out.println("Item not found in the menu");
		}
			
	}
	boolean authenicate(String username,String password)
	{
		return ownerusername.equals(username) && ownerpassword.equals(password);
	}
	

}

















