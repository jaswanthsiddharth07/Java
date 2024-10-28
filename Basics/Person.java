package test3;

public class Person {
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	String getname()
	{
		return name;
	}
	int getage()
	{
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person ("jaswanth",20);
		Person p2=new Person ("maradani",25);
		System.out.println("Name : " +p1.getname() +" & " +"Age : " +p1.getage());
		System.out.println("Name : " +p2.getname() +" & " +"Age : " +p2.getage());
	}

}
