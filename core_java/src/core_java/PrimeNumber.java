package core_java;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=61;
		boolean flage =false;
		for(int i=2; i<number; i++)
		{
	        if(number%i==0)
	        {
				flage =true;
				break;
	            
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

	



