package test3;

public class Airplane
{
	int flightnumber;
	String destination;
	String depaturetime;
	boolean delayed;
	Airplane(int flightnumber, String destination, String depaturetime,boolean delayed)
	{
		this.flightnumber=flightnumber;
		this.destination=destination;
		this.depaturetime=depaturetime;
		this.delayed=delayed;
	}
	 void checkstatus()
	 {
		 if(delayed)
		 {
			 System.out.println("The flight number is  "  +flightnumber +" "  + "is to destination location  "  +destination +" "+ " on depature time   "  +depaturetime +" " + "  is on time." );
		 }
		 else
		 {
			 System.out.println("The flight number is  "  +flightnumber +" "  + "is to destination location  "  +destination +" "+ " on depature time   "  +depaturetime +" " + "  is delayed." );
		 }
			 
		 }
		 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Airplane ob1=new Airplane(1234,"Vizag","15:40",true);
			Airplane ob2=new Airplane(54321,"Hyderabad","9:30",false);
			ob1.checkstatus();
			ob2.checkstatus();
	}

}
