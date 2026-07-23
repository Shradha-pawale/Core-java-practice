package classes_object;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Operation obj=new Operation();
		
		System.out.println("enter first number:");
		obj.num1=sc.nextInt();
		
		System.out.println("enter second number:");
		obj.num2=sc.nextInt();
		
		System.out.println("addition:"+(obj.num1+obj.num2));
		System.out.println("Substraction:"+(obj.num1-obj.num2));
		System.out.println("Multiplication:"+(obj.num1*obj.num2));	
		System.out.println("Division:"+(obj.num1/obj.num2));
		System.out.println("Modules:"+(obj.num1%obj.num2));
		
		sc.close();

}

}
class Operation{
	int num1;
	int num2;
	
}
