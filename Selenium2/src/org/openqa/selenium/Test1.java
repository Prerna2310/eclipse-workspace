package org.openqa.selenium;


	import java.util.ArrayList;

import org.testng.annotations.Test;

	public class Test1 {
			
			//Count number of names starting with alphabet A
		   @Test
			public void regular()
			{
				ArrayList<String> names= new ArrayList<String>();//creating object
				names.add("Abc");
				names.add("Ram");
				names.add("Aman");
				names.add("Asfd");
				names.add("Sita");
				int count=0;
				
				for(int i=0;i<names.size();i++)
				{
					String number=names.get(i);
					count++;
				}
				System.out.println(count);
			}
}
