package employeepro;

public class employeeinfo {
	

	int id;
	String name;
	String address;
	employeeinfo(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
