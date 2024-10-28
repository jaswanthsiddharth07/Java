package practice;
import java.util.Scanner;



public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*  	int a;
		int b;
		int c;
		Scanner sc= new Scanner(System.in);
		System.out.println("before swapping : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping :" +a +" " +b);
*/
		int a;
		int b;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();

		System.out.println("before swapping : " +a +" " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping : " +a +" " +b);
		
		
	}

}
