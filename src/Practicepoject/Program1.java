package Practicepoject;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("jva");
		
		String str="chandan";
		//StringBuilder sb=new StringBuilder(str);
		//System.out.println(sb.reverse());
		
		String reverse="";
		for(int i=0;i<str.length();i++) {
		
			
			reverse=str.charAt(i)+reverse;
			
		}
		System.out.println(reverse);
	}

}
