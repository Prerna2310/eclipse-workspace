package basicjava;

public class ReverseInteger {
	public static void main(String args[])
	{
		//1. Using proper algorithm
		long num=12345;
		long rev=0;
		while(num !=0) {
			rev=rev*10+num%10; //54
			num=num/10;//12
		}
			System.out.println("reverse num is "+rev);
			
		// 2. using STring Buffer reverse method
			long num1=123456;
			StringBuffer sf=new StringBuffer(String.valueOf(num1));
			System.out.println(sf.reverse());
	}

}
