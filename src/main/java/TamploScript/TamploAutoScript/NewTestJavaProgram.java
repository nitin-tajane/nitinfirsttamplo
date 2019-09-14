package TamploScript.TamploAutoScript;

public class NewTestJavaProgram 
{
   public static void main(String[] args) 
   {
	   //NewTestJavaProgram.Stringoperstion("a+bc-11xy+z dd.33");
	   
	   String teString= "jfsd.hfh3432423hjds";
	   String opertional = teString.replaceAll("[^a-z]", "");
	   System.out.println(opertional);
   }
	      
	   public static void Stringoperstion(String s1) 
	   {
	  	String getString = s1.replaceAll("[^\\d+]", "");
	  	//System.out.println(getString);
	  	if (getString.equalsIgnoreCase("123")) 
	  	{
	  		System.out.println(getString + " this string match for 123 condition");
	  	} else if (getString.contains("1133")) 
	  	{
	  		String spli = getString.substring(0, 2);
	  		String spli2 = getString.substring(2, 4);
	  		int sx = Integer.parseInt(spli);
	  		int s2 = Integer.parseInt(spli2);
	  		int sum = sx + s2;
	  		System.out.println(sum + " this string match for 1133 condition");
	  	}else if (getString.equals("118")) 
	  	{
	  		String sp = getString.substring(0, 1);
	  		String s2 = getString.substring(1, 3);
	  		int s12 = Integer.parseInt(sp);
	  		int s21 = Integer.parseInt(s2);
	  		int sum = s12 + s21;
	  		System.out.println(sum);
	  	}else 
	  	{
			System.out.println(getString + " this string not match for condition");
		}
	  	
	  }
	 //String s1 = "abc123xyz";
	   //s1.replaceAll("[^0-9.]", ""); //keep only 0 to 9 digit with dot
	 //s1.replaceAll("[^0-9]", ""); // keep only 0 to 9 digit
	   //s1.replaceAll("[^\\d]", ""); // keep only 0 to 9 digit
	 //s1.replaceAll("[^\\D]", ""); // keep only alphabets
	   //s1.replaceAll("[^a-z._-]", ""); keep alphabet with dot undercore dash and remove number and other things
	   //System.out.println(s2);
}
