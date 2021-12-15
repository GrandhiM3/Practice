package pr;

public class FindPrimeNumber {

	
	public static void getPrimeNumbers(int q) {
		
		for(int i=1;i<=q;i++) 
			{
			int temp = 0;
				for(int j=2; j<i-1;j++)
				{
					if(i%j == 0)
					{
						temp=temp+1;
					}
				}
					if
					(temp ==0) {
						System.out.print(i+" ");
					}
					}
			
			
	}
	
	public static void isPrimeorNot(int a) {
		int temp = 0;
		for(int i=2;i<a;i++){
			
			if (a%i==0) {
				temp = temp+1;
			}
		}
			if(temp>0) {
				System.out.println(a +" is not a Prime Number");
			}
			
			else {
				System.out.println(a +" is a Prime Number");
			}
	
		}
	
	
	public static void main(String[] args) {
		
		getPrimeNumbers(100);
		System.out.println();
		isPrimeorNot(11);
	}
}
