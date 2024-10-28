package test3;

public class Dog {
	String name;
	String breed;
	Dog(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	
	String getname()
	{
		return name;
	}
	String getbreed()
	{
		return breed;
	}
	void setName(String name)
	{
        this.name = name;
    }
	 void setbreed(String breed) 
	{
		this.breed= breed;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog("chocolate","German Shepherd");
		Dog d2=new Dog("cherry","Siberian Husky");
		System.out.println("intial values");
		System.out.println("Dogname : " +d1.getname() + "  " + "Dogbreed : " +d1.getbreed());
		System.out.println("Dogname : " +d2.getname() + "  "  + "Dogbreed : " +d2.getbreed());
		d1.setName("Charlie");
        d1.setbreed("Labrador");
        d2.setName("Rocky");
        d2.setbreed("Poodle");
        System.out.println("updated values");
        System.out.println("Dogname : " +d1.getname() + "  "  + "Dogbreed : " +d1.getbreed());
		System.out.println("Dogname : " +d2.getname() + "  "  + "Dogbreed : " +d2.getbreed());
		
	}

}
