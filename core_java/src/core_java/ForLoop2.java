package core_java;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int counter=0;
				for(int i=1; i<=10; i++) {
			System.out.println(7*i);
			boolean flage=false;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flage=true;
				}
			}
			if(flage==false) {
				System.out.println("prime:"+i);
				counter++;
				sum=sum+i;
			}
		}
		System.out.println("counter:"+counter);
		System.out.println(sum);
			
		}

	}


