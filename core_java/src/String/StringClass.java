package String;


public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="shradha";
		System.out.println("name:"+name);
		
		for(int i=0; i<name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		
		for(int i=6; i>=0; i--)
		{
		System.out.print(name.charAt(i));
		}
		System.out.println();
		
		System.out.println(10+10+name+10+10);
		
		System.out.println("ab"+10+5);
		System.out.println(10+5+"ab"
				+ "");
		

	}

}
