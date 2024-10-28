package practice;
import java.util.*;
public class PairOf {

	public static void main(String[] args) {
		int arr[]= {15,12,4,16,9,8,24,0,24};
		for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr);
		}
		
			for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]+" ");
				}
			for(int j=arr.length-1;j>0;j--) {
				System.out.println(arr[j]+" ");
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=arr.length-1;j>0;j--) {
					if(arr[i]+arr[j]==24 && i!= j) {
						//if(arr[i]!=arr[j]) {
						System.out.println(arr[i]+" "+arr[j]);
					}
				}
			}
		}

	
}

