package employeepro;
import java.util.*;

public class employeemethods {
	Scanner sc=new Scanner(System.in);
	
	 Map<Integer, employeeinfo> m1 = new HashMap<>();
	void addemployee()
	{
		System.out.println("Enter how many Employees to add : ");
	    int	n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter ID : ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		System.out.println("Enter Address : ");
		String address=sc.nextLine();
		m1.put(id, new employeeinfo(id,name,address));
		
		}
		System.out.println();
		System.out.println("Added Successfully");
		System.out.println();
			
	}
	void display()
	{
		 for (Map.Entry<Integer, employeeinfo> n1 : m1.entrySet()) 
		 {
			 System.out.println("Employee ID: " + n1.getKey()+" "+"Employee Name: " + n1.getValue().getName()+" "+"Employee Address: " + n1.getValue().getAddress());
		 }
	}
	void searchemployee()
	{
		System.out.println("Enter id to search : ");
		int eid=sc.nextInt();
		employeeinfo m = m1.get(eid);
		  if (m != null) {
	            System.out.println("Employee Id:"+eid);
	            System.out.println("Employee Name: " + m.getName());
	            System.out.println("Employee Address: " + m.getAddress());
	            
	           
	        } else {
	            System.out.println("Employee ID: " + eid + " is not found!");
	        }
	}
	void deleteemployee()
	{
		System.out.println("Enter id to delete : ");
		int eid=sc.nextInt();
		m1.remove(eid);
				
	}

}
