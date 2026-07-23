package NonPrimitiveDataType;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr={23,45,789,543};
		int num= -2147483648;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>num) {
				num=arr[i];
			}
		}
		System.out.println(num);
		

	}

}
