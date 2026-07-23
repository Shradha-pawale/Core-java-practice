package core_java;

public class PrimeNumber7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=2;
		int counter=0;
		int sum=0;
		while(counter<251) {
		boolean flage=true;
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				flage=false;
			}
		}
		if(flage)
			{
			counter++;
			sum=sum+number;
			System.out.println("prime;"+number);
			
		}
		
		number++;
	}
		System.out.println("counter:"+counter);
		System.out.println(sum);
	}

}
