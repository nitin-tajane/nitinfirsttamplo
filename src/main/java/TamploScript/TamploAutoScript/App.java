package TamploScript.TamploAutoScript;

import javax.sound.midi.VoiceStatus;

import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;


import com.sun.javafx.runtime.VersionInfo;

/**
 * Hello world!
 *
 */
public class App 
{
	
	String path = System.getProperty("user.dir");
	
	@Test(enabled=true)
    public void Testone()
    {
    	String input = "adcchjgjhg123hjjgj";
    	StringBuilder builder = new StringBuilder();
    	
    	for(int i=0;i<input.length();i++)
    	{
    		char c = input.charAt(i);
    		if (Character.isDigit(c)) 
    		{
				builder.append(c);
			}
    	}
    	System.out.println(builder.toString());
    }
    
    @Test(enabled=true)
 public void Stringoperstion() 
 {
	String getString = "";
	//System.out.println(getString);
	if (getString.equalsIgnoreCase("123")) 
	{
		System.out.println(getString);
	} else if (getString.contains("1133")) 
	{
		int sie = getString.length();
		System.out.println(sie);
		String spli = getString.substring(0, 2);
		String spli2 = getString.substring(2, 4);
		int s1 = Integer.parseInt(spli);
		int s2 = Integer.parseInt(spli2);
		int sum = s1 + s2;
		System.out.println(sum + " sum of aa11b33");
	}else if (getString.equals("118")) 
	{
		String s1 = getString.substring(0, 1);
		String s2 = getString.substring(1, 3);
		int s12 = Integer.parseInt(s1);
		int s21 = Integer.parseInt(s2);
		int sum = s12 + s21;
		System.out.println(sum);
	}
	{

	}
}   
   
    	
    
    @Test(enabled = false)
    public void test2()
    {
    	int a[] = {5,3,6,8,2,1};
    	int temp = 0;
    	
    	for (int i = 0; i < a.length; i++) 
    	{
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]<a[j]) 
				{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
    	
    	for (int i = 0; i < a.length; i++) 
    	{
		System.out.print(a[i]);	
		}
    }
    
   
    public void name() 
    {
    	
    	
		int a[] = {1,2,3,4,5,6,7};
		int n2 = 5;
		for (int n = n2; n < a.length; n++) 
		{
			System.out.print(a[n]);	
		}
		int n=n2;
		for (int i = 0; i < n; i++) 
		{
			System.out.print(a[i]);
		}
	}
}
