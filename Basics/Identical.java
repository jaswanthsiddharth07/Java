package practice;

public class Identical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][] = { {1,2,3}, {4,5,6}, {7,8,9}};
		int d[][] = { {1,2,3}, {4,5,6}, {7,8,9}};
		int result[][] = new int[3][3] ;
		for(int i=0;i<3;i++)
		{
			for( int j=0;j<3;j++)
			{
				result[i][j]= c[i][j]+d[i][j] ;
				System.out.print(" "+ result[i][j]+" ");
			}
			System.out.println();
			
		}
	

	}

}
