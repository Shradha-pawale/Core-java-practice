package classes_object;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department Employee=new Department();
		
		Employee.name="ram";
		Employee.id=101;
		Employee.salary=40000f;
		
		
		System.out.println("Employee details");
		System.out.println("Employee.name:"+Employee.name);
		System.out.println("Employee.id:"+Employee.id);
		System.out.println("Employee.salary:"+Employee.salary);
		

	}

}
class Department{
	
	String name;
	int id;
	float salary;
}
