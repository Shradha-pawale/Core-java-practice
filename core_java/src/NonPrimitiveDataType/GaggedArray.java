package NonPrimitiveDataType;

public class GaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int [][]arr=new int [3][];
		arr[0]=new int [2];
		arr[1]=new int [3];
		arr[2]=new int [1]; 
		
		
		arr[0][0]=10;
		arr[0][1]=20;
		
		arr[1][0]=30;
		arr[1][1]=40;
		arr[1][2]=50;
		
		arr[2][0]=60;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++ ) {
				arr[i][j]=arr.length;
				sum=sum+arr[i][j];
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++ ) {
			     System.out.print(arr[i][j]+ " ");
			} 
			System.out.println();
		}
			System.out.println("sum:"+sum);

		
		

	}

}
