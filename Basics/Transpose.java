package practice;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i =0; i<c.length;i++)
		{
			int sumrows = 0;
			int sumcol  = 0;
			for(int j =0; j<c.length;j++)
			{
				sumrows = c[i][j]+ sumrows ;
				sumcol = c[i][j]+ sumcol  ;
			}

			System.out.println("sumrows is : " +sumrows);
			System.out.println("sumcol is : " +sumcol );
			
		}
		
		
		
		
	}

}
