package classes_object;

public class Vehical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.speed=90;
		
		Bus b=new Bus();
		b.speed=70;
		
		Bike b1=new Bike();
		b1.speed=60;
		
		System.out.println("car speed:"+c.speed);
		System.out.println("bus speed:"+b.speed);
		System.out.println("bike speed:"+b1.speed);
				

	}

}
class Car{
	int speed;
	
}
class Bus{
	int speed;
	
}
class Bike{
	int speed;
	
}
