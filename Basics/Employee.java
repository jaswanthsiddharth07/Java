package test3;

public class Employee {
	String name;
	String jobtitle;
	double salary;
	double netsalary;
	Employee(String name,String jobtitle,double salary)
	{
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}
	void calculate()
	{
		double hra=0.10*salary;  	// hra-house rent allowance
		double ta=0.08*salary;		// ta -transport allowance
		double grosssalary = salary+hra+ta;
		double tax=0.05*grosssalary;
		netsalary=grosssalary-tax;
	}
	void update()
	{
		System.out.println("name : " +name);
		System.out.println("jobtitle : " +jobtitle);
		System.out.println("the updated salary : " +netsalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob = new Employee("jaswanth","webdeveloper",23000);
		ob.calculate();
		ob.update();
		}
}
