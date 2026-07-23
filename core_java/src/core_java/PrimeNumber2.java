package core_java;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		//int counter=0;
		boolean flage=true;
		for(int  i=1;i<=500;i++) {
			if(i%2!=0) {
				       
					System.out.println(i);
					//counter++;
					sum=sum+i;
				
				}
			}
		System.out.println(sum);
	//	System.out.println("::"+counter);
		
		
		
		for(int i=2;i<sum;i++) {
			if(sum%i==0) {
				flage=true;
			}
		}
		if(flage==false) {
			System.out.println("prime");
		}
		else {
			System.out.println("non prime");
		}
		}

	}


