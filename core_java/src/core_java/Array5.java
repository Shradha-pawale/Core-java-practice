package core_java;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {100,389,976,200};
		int num=2147483647;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<num) {
				num=arr[i];
			}
		}
		System.out.println(num);
		

	}

}
