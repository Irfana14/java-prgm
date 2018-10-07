import java.util.Scanner;

 class Concat
{
   public static void main(String args[])
   {
      String str1, str2;
      Scanner scan = new Scanner(System.in);
 
      System.out.print("Enter the String : ");
      str1 = scan.nextLine();
      
      str2 =(".");
      
     
      str1 = str1.concat(str2);
	  
      System.out.print("Output is " +str1);
   }
}
