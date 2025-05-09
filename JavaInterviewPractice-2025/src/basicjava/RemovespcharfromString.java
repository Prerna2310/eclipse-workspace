package basicjava;

public class RemovespcharfromString {

	public static void main(String[] args) {
	//Remove special characters from a string
		//Regular expression: [^a-zA-Z0-9
		
		String s="^&%#E^&%#^&^^& latin string9263878";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
