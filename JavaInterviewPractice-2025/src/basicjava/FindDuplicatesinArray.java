package basicjava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//import com.sun.tools.classfile.CharacterRangeTable_attribute.Entry;

public class FindDuplicatesinArray {

	public static void main(String[] args) {

		String names[]= {"Java","Javascript","Ruby","C","Python","Java"};
		
		//1. compare each element //Time complexity as we have 2 for loops O(nxn)--worst solution
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j])){//.equals function
					System.out.println("Duplicate element is " +names[i]);
				}
					
			}
		}
		//2. Using HashSet part of Java collection, it stores unique values : O(n)-better solution
		Set<String> store =new HashSet<String>();//stores unique value
		for(String name: names) {
			if(store.add(name)==false) {//adding values in store variable
				System.out.println("duplicate element is "+name);
			}
		}
		//3. Using HashMap --best solution
		Map<String, Integer> storeMap=new HashMap<String, Integer>();//String is Java and Integer is how many times java is stored
		for (String name: names) {
			Integer count = storeMap.get(name);//count is null as storeMap does not have any value 
			if(count==null)
				storeMap.put(name, 1); //putting the first value Java and count 1
			else
				storeMap.put(name, ++count);
			}
		//get values from this HashMap
		/*Map<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate element is "+ entry.getKey());
			}
		}*/
	}

}
