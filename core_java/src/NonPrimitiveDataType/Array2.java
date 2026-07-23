package NonPrimitiveDataType;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr={34,87,909,14};
		int num=2147483647;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<num) {
				num=arr[i];
				
			}
		}
		System.out.println(num);
		

	}

}
