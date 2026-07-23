package classes_object;

public class Colurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Red r1=new Red();
		r1.showA();
		
		Blue b1=new Blue();
		b1.showB();
		
		Green g1=new Green();
		g1.showC();	

	}

}
class Red{
	void showA() {
		System.out.println("this is Red colurs");
	}
	
}
class Blue{
	void showB() {
		System.out.println("this is Blue colurs");
	}
	
}
class Green{
	void showC() {
		System.out.println("this is Green colurs");
	}
	
	
}
