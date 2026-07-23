package classes_object;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student First=new Student();
		
		First.studentId=100;
		First.studentAge=21;
		First.studentName="shradha";
		First.student_standard=12;
		
		
		Student second=new Student();
		   
		 second.studentId=101;
		 second.studentAge=22;
		 second.studentName="sakshi";
		 second.student_standard=11;	
		
	System.out.println(First.studentId);
	System.out.println(First.studentAge);
	System.out.println(First.studentName);
	System.out.println(First.student_standard);
	
	
	System.out.println(second.studentId);
	System.out.println(second.studentAge);
	System.out.println(second.studentName);
	System.out.println(second.student_standard);	   

	}

}
class Student{
		
	int studentId;
	int studentAge;
	String studentName;
	int student_standard;	

}
