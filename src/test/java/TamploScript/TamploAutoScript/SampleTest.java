package TamploScript.TamploAutoScript;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class SampleTest 
{

@Test(enabled= false)
public  static void test()
{
	for(int p=1;p<=5;p++) 
	{
	for(int q=5;q>p;q--)
	{
		System.out.print(" ");
			
	}
	for(int r =1;r<=(p*2)-1;r++)
	{
		System.out.print("*");
	}
	System.out.println();
	}
		
	for(int i=4;i>=1;i--)
	{
		for(int j=5;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=(i*2-1);k++)
		{
		System.out.print("*");	
		}
		
		System.out.println();
	}
}

@Test(enabled=false)
public void test2()
{
	int q =1;
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print( q+"");
			q = q+1;
		}
		System.out.println();
	}
	
}

@Test
public void test3() 
{
	int p = 1;
   	for(int i=1;i<=5;i++)
   	{
   		for(int j=1;j<=i;j++)
   		{
   			System.out.print(p);
   			p = p+1;
   		}
   		System.out.println();
   	}
}

}
