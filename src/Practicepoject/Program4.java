package Practicepoject;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a=545355998;
		int reverse=0;
		while(a>0)
		{
			int rem=a%10;
			
			reverse=reverse*10+rem;
			a=a/10;
		}
			
	
		System.out.println(reverse);
	}

}
