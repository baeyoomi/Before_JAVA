package test;

public class Test05 {

	public static void main(String[] args) {
		int total=0;
		for(int i=1; i<11; i++) {				
				total += i;
		System.out.print(i);
		if(i != 10) 
		{System.out.print("+");}
		}
		System.out.println("=" + total);		
	}

}
