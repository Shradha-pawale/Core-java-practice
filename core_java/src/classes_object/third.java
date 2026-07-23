package classes_object;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		
		College third=new College();
		
		third.collegeId=102;
		third.collegeCode=179;
		third.collegeName="MATHOSHRI";
		third.collegeCourse="BCA,BCS";
		

        College second=new College();
		
        second.collegeId=101;
        second.collegeCode=169;
        second.collegeName="ITM";
        second.collegeCourse="BCA";
        
        College first=new College();
		
		first.collegeId=100;
		first.collegeCode=159;
		first.collegeName="MGM";
		first.collegeCourse="BCS";
		
			
		System.out.println("COLLEGE THIRD");
		System.out.println("collegeId:"+third.collegeId);
		System.out.println("collegeCode:"+third.collegeCode);
		System.out.println("collegeName:"+third.collegeName);
		System.out.println("collegeCourse:"+third.collegeCourse);
		
		System.out.println();
		
		System.out.println("COLLEGE SECOND");
		System.out.println("collegeId:"+second.collegeId);
		System.out.println("collegeCode:"+second.collegeCode);
		System.out.println("collegeName:"+second.collegeName);
		System.out.println("collegeCourse:"+second.collegeCourse);

		System.out.println();
		
		System.out.println("COLLEGE FIRST`");
		System.out.println("collegeId:"+first.collegeId);
		System.out.println("collegeCode:"+first.collegeCode);
		System.out.println("collegeName:"+first.collegeName);
		System.out.println("collegeCourse:"+first.collegeCourse);

	}

}
class College{
	
	 int collegeId;
	 int collegeCode;
	 String collegeName;
	 String collegeCourse;
	 
	 
}
