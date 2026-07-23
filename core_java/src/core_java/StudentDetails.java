package core_java;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student details:");
		System.out.println("enter student name:");
		String name=sc.nextLine();
		System.out.println("Enter Student coursename:");
		String coursename=sc.nextLine();
		System.out.println("Enter Student RollNo:");
		int RollNo=sc.nextInt();
		System.out.println("enter student total marks:");
		int marks=sc.nextInt();
		System.out.println("enter percentage:");
		int percentage=sc.nextInt();
		System.out.println("name:"+name);
		System.out.println("coursename:"+coursename);
		System.out.println("RollNo:"+RollNo);
		System.out.println("marks:"+marks);
		System.out.println("percentage:"+percentage);
		sc.close();
		
		
		

	}

}
