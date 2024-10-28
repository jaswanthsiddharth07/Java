package food;
import java.util.*;
import java.util.Scanner;
import java.util.Calendar;
public class customer extends restaurant
{
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer> order=null;
	customer()
	{
		order=new HashMap<>();
	}
	void Viewmenu()
	{
		super.Displaymenu();
	}
	void Takeorder()
	{
		System.out.print("Enter which item would you like to order : ");
		String itemorder=sc.nextLine().toLowerCase();
		if(menu.containsKey(itemorder))
		{
			System.out.print("Enter quantity : ");
			int quantity=sc.nextInt();
			sc.nextLine();
			order.put(itemorder, quantity);
			System.out.println(itemorder +" has been ordered ");
		}
		else
		{
			System.out.println("Item not found in the menu ");
		}
		
		
	}
	void Vieworder()
	{
		int total=0;
		if(order.isEmpty())
		{
			System.out.println("Add Items");
		}
		else
		{
			System.out.println(" Your Order ");
			Set<String> s=new HashSet<>();
			s=order.keySet();
			
			System.out.println("Food item" +" \t " +"Price" +" \t " +"Quantity" +" \t " +"Total");
			for(String fooditem:s)
			{
				total=menu.get(fooditem) * order.get(fooditem);
				System.out.println(fooditem +" \t " +menu.get(fooditem)+" \t " +order.get(fooditem) + " \t "+total);
			}
		}
		
	}
	void updateorder()
	{
		System.out.println("Enter item to update : ");
		String updateitem=sc.nextLine().toLowerCase();
		if(order.containsKey(updateitem))
		{
			System.out.println("Enter item : ");
			String foodname=sc.nextLine().toLowerCase();
			System.out.println("Enter quantity : ");
			int quantity=sc.nextInt();
			order.replace(foodname, quantity);
			System.out.println(" Item updated ");
		}
		else
		{
			System.out.println(" Item not found in the order ");
		}
		
	}
	void removeorder()
	{
		System.out.println(" Enter item to remove : ");
		String removeitem=sc.nextLine().toLowerCase();
		if(order.containsKey(removeitem))
		{
			order.remove(removeitem);
		    System.out.println(" Item removed ");
		}
		else
		{
			System.out.println(" Item not found in the order ");
		}
	}
	void generatebill()
	{
		if(order.isEmpty())
		{
			System.out.println(" Add Items ");
		}
		else
		{
			int total=0;
			int totalbill =0;
			Set<String> s1=new HashSet<>();
			s1=order.keySet();
			for(String fooditem:s1)
			{
				total=menu.get(fooditem) * order.get(fooditem);
				totalbill = totalbill + total;
			}
			double tax=totalbill * (0.10);
			double finalamount = totalbill + tax ;
			double discount=0;
			Calendar currentdate=Calendar.getInstance();
			int currentday=currentdate.get(Calendar.DAY_OF_MONTH);
			int currentmonth=currentdate.get(Calendar.MONTH)+1;
			System.out.println("Show your Aadhar Card ");
			System.out.print("Enter your Date of birth as per in the Aadhar Card (format : dd/mm/yyyy) : ");
			String dob=sc.nextLine();
			String[] dobparts=dob.split("/");
			int dobday=Integer.parseInt(dobparts[0]);
			int dobmonth=Integer.parseInt(dobparts[1]);
			if(currentday == dobday && currentmonth==dobmonth)
			{
				discount=finalamount*(0.10);
				System.out.println("Happy Birthday! You get a 10% discount");
			}
			else
			{
				System.out.println("No discount today.Have a nice day!");
			}
			
			finalamount=finalamount-discount;
			 System.out.println("\n--- Bill ---");
		        System.out.println("Total Cost: " +totalbill);
		        System.out.println("Tax (10%): " +tax);
		        System.out.println("Discount: " +discount);
		        System.out.println("Final Total: " +finalamount);		
		}
		
	}
}





