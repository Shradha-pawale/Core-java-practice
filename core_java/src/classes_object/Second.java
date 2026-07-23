package classes_object;

public class Second {

	public static void main(String[] args) {
		
		Student1 Second=new Student1();
		
		Second.Student1Id=10;
		Second.Student1Name="shradha";
		Second.Student1Course="Computer Science";
		Second.Student1Address="Nanded";
		
		Student2 third=new Student2();
		
		third.Student2Id=20;
		third.Student2Name="sakshi";
		third.Student2Course="It";
		third.Student2Address="pune";
		
		Student3 four=new Student3();
		
		four.Student3Id=20;
		four.Student3Name="samiksha";
		four.Student3Course="It";
		four.Student3Address="pune";
		
		
		System.out.println("Student1Id:"+Second.Student1Id);
		System.out.println("Student1Name:"+Second.Student1Name);
		System.out.println("Student1Course:"+Second.Student1Course);
		System.out.println("Student1Address:"+Second.Student1Address);
		
		System.out.println();
		
		System.out.println("Student2Id:"+third.Student2Id);
		System.out.println("Student2Name:"+third.Student2Name);
		System.out.println("Student2Course:"+third.Student2Course);
		System.out.println("Student2Address:"+third.Student2Address);
		
		System.out.println();
		
		System.out.println("Student3Id:"+four.Student3Id);
		System.out.println("Student3Name:"+four.Student3Name);
		System.out.println("Student3Course:"+four.Student3Course);
		System.out.println("Student3Address:"+four.Student3Address);
			

	}

}
class Student1{
	
	int Student1Id;
	String Student1Name;
	String Student1Course;
	String Student1Address;
	
	
}
class Student2{
	int Student2Id;
	String Student2Name;
	String Student2Course;
	String Student2Address;
	
	
}
class Student3{
	int Student3Id;
	String Student3Name;
	String Student3Course;
	String Student3Address;
	
}

