package test3;

public class reversestring 
{
 public static void main (String[] args)
 {
   
     String s= "jaswanth", a="";
     char ch;
   
   System.out.print("Original word: ");
   System.out.println("jaswanth"); 
  
   for (int i=0; i<s.length(); i++)
   {
     ch= s.charAt(i); 
     a= ch+a; 
   }
   System.out.println("Reversed word: "+ a);
 }
}