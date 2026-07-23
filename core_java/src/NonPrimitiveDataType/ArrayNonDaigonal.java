package NonPrimitiveDataType;

public class ArrayNonDaigonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr=new int [2][2];
		  arr[0][0]=2;
		  arr[0][1]=6;
		  arr[1][0]=2;
		  arr[1][1]=8;
		  
		  boolean nonZeroCheck=true;
		  boolean zeroCheck=true;
		  
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i!=j) {
					if(arr[i][j]==0) {
						nonZeroCheck=false;
						
					}
				}
				else {
					if(arr[i][j]!=0) {
						zeroCheck=false;
						
					}
				}
				
			}
			
		}
		if(nonZeroCheck && zeroCheck) {
			System.out.println("non Daigonal matrix");
		}
		else {
			System.out.println("simple");
		}
		
		
		

	}

}
