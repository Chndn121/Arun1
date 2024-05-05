package Practicepoject;

import java.util.LinkedHashSet;

public class DuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a[]= {"mohan","sohan","ramesh","mohan"};
		
		System.out.println(a[0]);
		
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		
		System.out.println(set);
	}

}
