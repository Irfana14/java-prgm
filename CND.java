/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class CND { 

	static int countDigit(int n) 
	{ 
		int count = 0; 
		while (n != 0) { 
			n = n / 10; 
			++count; 
		} 
		return count; 
	} 

	/* Driver program to test above function */
	public static void main(String[] args) 
	{ 
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
	
		System.out.print("" + countDigit(num)); 
	} 
} 
// This code is contributed by Arnav Kr. Mandal. 
