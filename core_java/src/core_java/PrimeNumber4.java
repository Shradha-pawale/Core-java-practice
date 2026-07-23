package core_java;

public class PrimeNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=16;
		boolean flage=false;
		for(int i=2; i<=num; i++) {
			if(num%i==0) {
				flage=true;
			}
		}
			if(flage==false) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			
			}
		}

	}


