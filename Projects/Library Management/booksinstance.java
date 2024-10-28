package librarybooks;

public class booksinstance {
	int Bid;
	String Bname;
	String Bauthor;
	String Bcategory;
	
	booksinstance(int Bid,String Bname,String Bauthor,String Bcategory)
	{
		this.Bid=Bid;
		this.Bname=Bname;
		this.Bauthor=Bauthor;
		this.Bcategory=Bcategory;
	}
	public String getBname()
	{
		return Bname;
	}
	public void setBname(String Bname)
	{
		this.Bname=Bname;
		
	}
	public String getBauthor()
	{
		return Bauthor;
	}
	public void setBauthor(String Bauthor)
	{
		this.Bauthor=Bauthor;
		
	}
	public String getBcategory()
	{
		return Bcategory;
	}
	public void setBcategory(String Bcategory)
	{
		this.Bcategory=Bcategory;
		
	}
}
