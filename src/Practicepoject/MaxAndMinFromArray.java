package Practicepoject;

import java.util.Arrays;

public class MaxAndMinFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {5,3,31,8,15,10};
	
		Arrays.sort(a);
		int max=a[a.length-1];
		int min=a[0];
		System.out.println(max);
		System.out.println(min);
	}

}
