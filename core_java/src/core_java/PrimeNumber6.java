package core_java;

public class PrimeNumber6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int counter=0;
		
		for(int i=1; i<=100; i++) {
			if(i==1) {
				continue;
			}	
			
			boolean flage=false;
			
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flage=true;
				}
			}
			if(flage) {
				System.out.println("not prime");
			}
			else {
				
				System.out.println("prime:"+i);
				sum=sum+i;
				counter++;
			}
		}
	
		System.out.println(sum);
		System.out.println("counter:"+counter);
}

}


