/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Alpha
{
	public static void main(String[ ] arg)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=sc.next( ).charAt(0);	 
	//char ch=sc.nextChar();
	
	if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	System.out.println("Alphabet");

		else
		System.out.println("invalid");		
	}

}
