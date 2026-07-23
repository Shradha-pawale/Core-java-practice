package core_java;

public class PrimeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; 
		boolean flage=false;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		for(int i=2; i<sum; i++) {
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
		

	
