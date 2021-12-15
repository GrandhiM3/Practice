package pr;

public class Exam {
	
	public static void getAllPNumbers(int givenNo) {
		
		for(int i=1;i<=givenNo;i++) {
			int temp=0;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.print(i+" ");
			}
		}
		
	}

	public static void isPNumber(int givenNo) {
		int temp=0;
		for(int i=2;i<givenNo;i++) {
			if(givenNo%i==0) {
				temp = temp+1;
			}
		}
		if(temp>0) {
			System.out.println(givenNo +" is not a Prime Number");
		}
		if(temp==0)
		{
			System.out.println(givenNo +" is a Prime Number");
		}
	}
	public static void main(String[] args) {
		getAllPNumbers(2000);
		System.out.println();
		isPNumber(7);
	}
}
