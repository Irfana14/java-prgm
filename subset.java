import java.util.*;
import java.math.*;
import java.lang.*;


 class subset
{
	static void tofind(int[] arr1, int[] arr2)
	{
		int a=arr1.length;
		int b=arr2.length;
		int i=0;	
		int flag=0;
		while(i<b)
		{
			flag=0;
			for(int j=0;j<a;j++)
			{
				if(arr2[i]==arr1[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("NO");
				break;
			}
			i++;
		}
		
		if(flag==1)
			System.out.println("YES");

	}
	public static void main(String[] args)
	{
			Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b=s.nextInt();
		int[] arr1=new int[a];
		int[] arr2=new int[b];
		int i=0;
		
		while(i<a)
		{
			arr1[i]=sn.nextInt();
			i++;
		}
		i=0;
			while(i<b)
		{
			arr2[i]=sn.nextInt();
			i++;
		}
		tofind(arr1,arr2);		
	}	
	}
