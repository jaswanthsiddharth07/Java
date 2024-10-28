package test3;

public class Rectangle {
	double width;
	double height;
	Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	void area()
	{
		double a= width*height;
		System.out.println("Area of a Rectangle : " +a);
		 	 
	}
	 void  perimeter()
	 {
		 double p= 2 * (width + height);
		 System.out.println("Perimeter of a Rectangle : " +p);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(5,10);
		r.area();
		r.perimeter();
		

	}

}
