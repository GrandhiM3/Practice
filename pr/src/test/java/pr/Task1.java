package pr;

public class Task1 {
	
	
	public static void browser(int q) {
		int a=3;
		int b=5;
		
			if((q%a == 0) && (q%b == 0)) {
			System.out.println("Hello");
			
		}
		
		if(q%b ==0) {
			System.out.println("False");
		}
		
		if (q%a == 0) {
			
			System.out.println("True");
		}
		
		if(q%a!=0 && q%b!=0) {
			System.out.println("The Given Number does not met any condition");
		}
			
		
	}
		
	}
	



