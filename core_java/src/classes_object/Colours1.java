package classes_object;
import java.util.Scanner;

public class Colours1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Black b1=new Black();
		
		White w1=new White();
		
		
	    System.out.println("enter colours:");
	    String colours=sc.nextLine();
	    
	    if(colours.equalsIgnoreCase("Black")) {
	    	b1.showA();
	    }
	    else if (colours.equalsIgnoreCase("White")) {
	    	w1.showB();    
	    }
	    else {
	    	System.out.println("invalid colour");
	    }
	    sc.close();
	    	
	    }
}
	   
class Black{
	void showA() {
		System.out.println("this is black colours");
	}
	
}
class White{
	void showB() {
		System.out.println("this is white colours");
	}
	
}

