package core_java;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3467;
		boolean flage=false;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0) {
				flage= true;
				break;

			}
		}
		if(flage==false) {
			System.out.println("prime");
		}
		else {
			System.out.println("composite");
		}

	}

}
