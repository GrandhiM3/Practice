package pr;

public class PrimeNumbers{
	
	
	
	public static void primenumbers(int q) {
		
		
		for(int i=1;i<=q;i++) {
			int y =0;
			for(int j = 2;j<=i-1;j++) {
				
				if(i%j==0)
					{
					y=y+1;
						}
			}
				if(y==0) {
					System.out.print(i +"  " );
				}
				
			}
			
			
		}
		
	
	
	public static void main(String[] args) {
		
		primenumbers(100);
	}
}


