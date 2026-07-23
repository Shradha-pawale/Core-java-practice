package core_java;

public class PrimeNumber9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=13;
		boolean flag=false;
		
		for(int i=2;i<=number; i++) {
			if(number%i==0) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("prime:"+number);
			}
		else {
			System.out.println("not prime number");
		}

	}

}
