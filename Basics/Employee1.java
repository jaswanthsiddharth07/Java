package test3;
import java.time.LocalDate;
import java.time.Period;;

public class Employee1 {
	String name;
	double salary;
	LocalDate hiredate;
	boolean istemporary; 
	
	Employee1(String name,double salary,LocalDate hiredate,boolean istemporary)
	{
		this.name=name;
		this.salary=salary;
		this.hiredate=hiredate;
		this.istemporary=istemporary;
	}
	int getYearsOfService() 
	{
        return Period.between(hiredate, LocalDate.now()).getYears();
	}
	public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Years of Service: " + getYearsOfService());
        if (istemporary)
        {
        	System.out.println("The Permanent Employee ");
        	
        } else
        {
        	System.out.println("Contract Duration: " + (12 - getYearsOfService() % 12) + " months (assumed)");
        	System.out.println("the Temporary Employee ");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 ob = new Employee1("jaswanth",23000,LocalDate.of(2020, 12, 14),true);
		Employee1 ob1= new Employee1("maradani",16000,LocalDate.of(2023,10 , 12),false);		
		ob.display();
		ob1.display();
	}

}
