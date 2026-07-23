package classes_object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition obj1=new Addition();
		 
		obj1.a=10;
		obj1.b=20;
			
		Substraction obj2=new Substraction();
		
		obj2.a=30;
		obj2.b=40;
		
		Multiplication obj3=new Multiplication();
		
		obj3.a=50;
		obj3.b=60;
		
		Division obj4=new Division();
		
		obj4.a=70;
		obj4.b=80;
				
		
		System.out.println("Addition:"+(10+20));
		System.out.println("Substraction:"+(30-40));
		System.out.println("Multiplication:"+(50*60));
		System.out.println("Division:"+(70/80));	

	}

}
class Addition{
	int a;
	int b;
	
}
class Substraction{
	int a;
	int b;
	
}
class Multiplication{
	int a;
	int b;
}
class Division{
	int a;
	int b;
}

