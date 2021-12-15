package pr;

public class Execution {
	
	
	
	public static void primeNoVerification(int givenNo) {
		
		int temp=0;
		for(int i =2; i<givenNo-1;i++) {
			if(givenNo%i==0) {
				temp = temp+1;
			}
		}
		if(temp>0) {
			System.out.println(givenNo +" is not a Prime Number");
				}
		else {
			System.out.println(givenNo +" is a Prime Number");
		}
			
		
	}
	public static void main(String[] args) {
		
			FindPrimeNumber.isPrimeorNot(100);
			primeNoVerification(7);
			FindPrimeNumber.getPrimeNumbers(259);
	}
	


}

