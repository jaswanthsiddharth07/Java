package practice;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		int ar[]={10,20,60,70};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(arr[i]==ar[j]) {
					System.out.println(arr[i] +" "+"is common with "+ar[j]);
				}
			}
		}
	}

}
