package core_practise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Car c1=new Car();
		
		Bike b1=new Bike();
		
		Bus b=new Bus();
		
		c1.start();
		b1.ride();
		b.stop();	 
		
	}
}
class Car{
	void start() {
		System.out.println("car started");
	}
		
}
class Bike{
	void ride() {
		System.out.println("bike  is running");
	}
	
}

class Bus{
	void stop() {
		System.out.println("bus stopped");
	}
	
}