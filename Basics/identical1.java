package practice;

public class identical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		int c[][] = { {1,2,3}, {4,5,6}, {7,8,9}};
		int d[][] = { {1,7,3}, {4,5,6}, {7,8,9}};
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(c[i][j]!=d[i][j])
				{
					flag=false;
					break;
				}
			}
			
		}
		if(flag)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}

	}

}
