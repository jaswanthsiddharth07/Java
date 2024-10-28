package food;
import java.util.Scanner;

public class restaurantmanagement {

	public static void main(String[] args) {
		//restaurant res=new restaurant();
		customer cus=new customer();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Owner");
			System.out.println("2. Customer");
			System.out.println("3. Exit");
			System.out.print("Choose an option : ");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1: 
				System.out.print("Enter username : ");
				String username=sc.nextLine().toLowerCase();
				System.out.print("Enter password : ");
				String password=sc.nextLine().toLowerCase();
				if(cus.authenicate(username,password))
				{
					System.out.println("Login Successfully ");
					while(true)
					{
						System.out.println("Owner Menu ");
						System.out.println("1. Add Menu ");
						System.out.println("2. View Menu ");
						System.out.println("3. Update Menu Item Price ");
						System.out.println("4. Delete Item ");
						System.out.println("5. Logout ");
						System.out.print("Choose an option :  ");
						int ownerchoice=sc.nextInt();
						sc.nextLine();
						switch(ownerchoice)
						{
						case 1:
							cus.Additem();
							break;
						case 2:
							cus.Displaymenu();
							break;
						case 3:
						    cus.Updateprice();
						    break;
						case 4:
							cus.Deleteitem();
							break;
						case 5:
							System.out.println(" Logout Successfully ");
							break;
						default:
							System.out.println(" Invalid option ");
						       
						}
						if(ownerchoice==5)
						{
							break;
						}
					
				  } 
			 }
			else
				{
					System.out.println(" Invalid username or paswword ");
				}
				break;
			case 2:
				System.out.print("Enter name : ");
				String name=sc.nextLine().toLowerCase();
				System.out.println("Name of the customer : " +name);
				while(true)
				{
					System.out.println("Customer menu ");
					System.out.println("1. View Menu ");
					 System.out.println("2. Take Order");
                     System.out.println("3. View Order");
                     System.out.println("4. Update Order");
                     System.out.println("5. Remove Order");
                     System.out.println("6. Generate Bill");
                     System.out.println("7. Back to Main Menu");
                     System.out.print("Enter choice : ");
                     int customerchoice=sc.nextInt();
                     switch(customerchoice)
                     {
                     case 1:
                    	 cus.Displaymenu();
                    	 break;
                     case 2:
                    	 cus.Takeorder();
                    	 break;
                     case 3:
                    	 cus.Vieworder();
                    	 break;
                     case 4:
                    	 cus.updateorder();
                    	 break;
                     case 5:
                    	 cus.removeorder();
                    	 break;
                     case 6:
                    	 cus.generatebill();
                    	 break;
                     case 7:
                    	 System.out.println("Returning to main menu...");
                         break;
                     default:
                         System.out.println(" Invalid option ");
                     }
                     if(customerchoice==7)
                     {
                    	 break;
                     }
                     
				}
				break;
			case 3:
				System.out.println("Thanks for using Restaurant Management System ");
				break;
			default:
				System.out.println(" Invalid Option");
				
					
			}
		}

	}

}
