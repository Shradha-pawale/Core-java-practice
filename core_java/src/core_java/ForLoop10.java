package core_java;

public class ForLoop10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int counter=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0 && i%3==0) {
				System.out.println(i);
				sum=sum+i;
				counter++;
			}
			
		}
		System.out.println(sum);
		System.out.println(counter);
	}
}
		
	
		

