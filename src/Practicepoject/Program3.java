package Practicepoject;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String m="RamaOshsusT";
		int Uppercount=0;
		int Lowercount=0;
		
		for(int i=0;i<m.length();i++) {
			
		char ch=m.charAt(i);
		
		if(ch>=65 && ch <=90)
		{
			Uppercount++;
		}
		else {
			Lowercount++;
		}
		
		}
		
		System.out.println(Uppercount);
		System.out.println(Lowercount);
		
		
		}
	}


