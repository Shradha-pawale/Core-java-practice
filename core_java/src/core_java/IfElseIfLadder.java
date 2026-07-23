package core_java;

public class IfElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=85;
		if(marks>=35) {
			System.out.println("pass");
		}
		else if(marks>=80) {
			System.out.println("grade a");
		}
		else if(marks>=70) {
			System.out.println("grade b");
		}
		else if(marks>=60) {
			System.out.println("grade c");
		}
		else {
			System.out.println("fail");
		}

	}

}
