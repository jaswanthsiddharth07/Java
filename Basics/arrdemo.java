package practice;
import java.util.Scanner;
public class arrdemo {
	int getmarks(int marks[])
	{
		int sum=0;
		for(int i=marks.length-1;i>=marks.length-3;i--)
		{
			sum=sum+marks[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrdemo a=new arrdemo();
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[5];
		System.out.println("Enter marks : ");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
			
		}
		//System.out.println("Total marks: " +a.getmarks(marks));
		System.out.println(a.getmarks(marks));
		
	}

}
