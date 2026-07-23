package core_java;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0, b=1, c;
		System.out.print(a+" "+b+" ");
		
		for(int i=1; i<=8; i++) {
			c=a+b; // 0+1=> 1, 1+1=> 2, 1+2=>3, 2+3=>5, 3+5=> 8, 5+8=> 13, 8+13=> 21, 13+21=>34
			System.out.print(c+" ");
			
			a=b;
			b=c;
			
		}

	}

}
