package core_practise;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Java_uss First=new Java_uss();
		First.name="shradha";
		First.age=21;
		First.gender='f';
		First.laptop="hp";
		
		Java_uss second=new Java_uss();
		second.name="sakshi";
		second.age=20;
		second.gender='f';
		second.laptop="asus";

		
		System.out.println(First.name);
		System.out.println(First.age);
		System.out.println(First.gender);
		System.out.println(First.laptop);
		
		System.out.println(second.name);
		System.out.println(second.age);
		System.out.println(second.gender);
		System.out.println(second.laptop);
		
		System.out.println(Java_uss.teacher);
		System.out.println(First.teacher);
		System.out.println(second.teacher);
		
		First.teacher="mahi";
		
		System.out.println(First.teacher);
		System.out.println(second.teacher);
		System.out.println(Java_uss.teacher);	
		
		First.Study();
		First.Sleep();
		second.travel();
		
	}

}
class Java_uss{
	static String teacher="mahesh";
	String name;
	int age;
	char gender;
	String laptop;
	
	public void Study() {
		System.out.println("i am Studying");
	}
	
	public void Sleep() {
		System.out.println("i am sleeping");
	}
	
	public void travel()
	{
		System.out.println("travling..");
	}
}
