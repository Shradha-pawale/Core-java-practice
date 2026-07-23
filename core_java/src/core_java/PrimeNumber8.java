package core_java;

public class PrimeNumber8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int sum=0;
		for(int i=1; i<=1000;i++) {
			if(i==1) {
				continue;
			}
			boolean flage=false;
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					flage=true;
				}
			}
			if(flage==false) {
				System.out.println("prime:"+i);
				counter++;
				sum=sum+i;
				
			}
//			else {
//				System.out.println("not prime:"+i);
//			}
		}
		System.out.println("counter:"+counter);
		System.out.println(sum);
		
		}

	}


