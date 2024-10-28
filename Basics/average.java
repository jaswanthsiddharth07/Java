package test3;
import java.util.Scanner;
public class average {

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter Limit: ");
      int n=in.nextInt();
      int sum=0,a;
      for(int i=1;i<=n;i++)
      {
          System.out.print("Enter The Number "+i+": ");
          a=in.nextInt();
          sum+=a;
      }
      in.close();
      System.out.println("The Average of Given numbers is : "+sum/n);
  }
}
