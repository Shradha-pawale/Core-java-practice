package core_java;

public class SwappingTwoVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int temp;
		
		System.out.println("before swapping :");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
