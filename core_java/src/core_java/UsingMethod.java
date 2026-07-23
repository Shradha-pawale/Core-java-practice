package core_java;

public class UsingMethod {
	void show() {
		int a=10, b=20;
		int add,sub,mult;
		float div;
		add=(a+b);
		sub=(a-b);
		mult=(a*b);
		div=(a/b);
		System.out.println("Addition:"+add);
		System.out.println("Substraction:"+sub);
		System.out.println("division:"+div);
		System.out.println("multiplication:"+mult);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingMethod u=new UsingMethod();
		u.show();
		

	}

}
