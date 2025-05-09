package basicjava;

public class ReverseString {
	
	public static void main(String args[])
	{
		//Reverse a string
		//Difference between STring and StringBuffer
		//do we have reverse function in String
		String s="Selenium";
		
		//System.out.println(s.rev); //not possible as String is an immutable object and reverse function is not available
		//output-muineleS
		
		//1.using for loop
		int len=s.length(); //8
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);//m
			
		}
		System.out.println(rev);
		
		//2.Using String Buffer
		StringBuffer sf=new StringBuffer(s);//Stringbuffer mutable string so reverse function is there
		System.out.println(sf.reverse());
	}

}
