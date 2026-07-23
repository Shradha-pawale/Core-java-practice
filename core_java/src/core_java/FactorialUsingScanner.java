package core_java;
import java.util.Scanner;

public class FactorialUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println("factorial:"+fact);
		sc.close();

	}

}
