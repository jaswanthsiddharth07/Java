package librarybooks;
import java.util.*;
public class bookmethods {
	Scanner sc=new Scanner(System.in);
	ArrayList<booksinstance> a1=null;
	bookmethods()
	{
		a1=new ArrayList<booksinstance>();
	}
	void addbooks()
	{
		System.out.print("Enter how many Books to add : "); 
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter Book Id : ");
			int Bid=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Book Name : ");
			String Bname=sc.nextLine();
			System.out.print("Enter Book Authorname : ");
			String Bauthor=sc.nextLine();
			System.out.print("Enter Book Category : ");
			String Bcategory=sc.nextLine();
			booksinstance ob= new booksinstance(Bid,Bname,Bauthor,Bcategory);
			a1.add(ob);
		}
		System.out.println("Added Successfully");
	}
	void displaybooks()
	{
		for(booksinstance e:a1)
		{
			System.out.println("Book id-" +e.Bid +"  "+"Book Name-" +e.Bname +"  "+"Book Authorname-" +e.Bauthor);
		}
		System.out.println("Displayed Succesfully");
	}
	void isavailable()
	{
		boolean checkstatus=false;
		System.out.print("Enter Bookid to search : ");
		int id=sc.nextInt();
		for(booksinstance e:a1)
		{
			if(e.Bid==id)
			{
				checkstatus=true;
				break;
			}
		}
		if(checkstatus)
		{
			System.out.println("The Book is Available");
			
			
		}
		else
		{
			System.out.println("The Book is not Available");
		}
			
	}
	void renamebook()
	{
		System.out.print("Enter Book id to update : ");
		int Bid=sc.nextInt();
		boolean Brename=false;
		for(booksinstance e:a1)
		{
			if(e.Bid==Bid)
			{
				Brename=true;
				sc.nextLine();
				System.out.print("Enter Book Name to update : ");
				String Bname = sc.nextLine();
				System.out.print("Enter Book Author to update : ");
				String Bauthor = sc.nextLine();
				System.out.print("Enter Book Category to update : ");
				String Bcategory = sc.nextLine();
				e.setBname(Bname);
				e.setBauthor(Bauthor);
				e.setBcategory(Bcategory);	
			}
		}
		if(Brename)
		{
			System.out.println("The Books are updated");
		}
		else
		{
			System.out.println("The Id not found");
		}
	}
	void deletebook()
	{
		System.out.print("Enter Id to Delete : ");
		int id=sc.nextInt();
		boolean b=false;
		for(booksinstance e:a1)
		{
			if(id==e.Bid)
			{
				b=true;
				a1.remove(e);	
				break;
			}
		}
		if(b)
		{
			System.out.println("The id is deleted");
		}
		else
		{
			System.out.println("The id not found");
		}
		
	}
	
	
	
	
	

}
