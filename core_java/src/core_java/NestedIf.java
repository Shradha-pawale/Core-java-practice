package core_java;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary=5000;
		if(salary>=25000) {
			if(salary<30000 &&salary>=5000) {
				System.out.println("medium salary");
			}
			else {
				System.out.println("high salary");
			}
		}
			else {
				System.out.println("less salary"); 
				
			}
		}
		

	}


