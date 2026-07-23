package core_java;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter your name:");
		String name=sc.nextLine();
		System.out.println("enter your age:");
		int age=sc.nextInt();
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		sc.close();

	}

}
