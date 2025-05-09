package basicjava;

public class Swap2Strings {

	public static void main(String[] args) {
		
		String s1="Rahul";
		String s2="Shetty";
		
		s1=s1+s2;
		System.out.println(s1);//RahulShetty
		
		s2=s1.substring(0, s1.length()-s2.length());//(0,11-6=5)
		System.out.println(s2);//Rahul
		
		s1=s1.substring(s2.length());
		System.out.println(s1+" "+ s2);//Shetty Rahul
		
	}

}
