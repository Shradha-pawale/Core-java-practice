package NonPrimitiveDataType;

public class ArrayDigonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int [2][2];
		boolean nonZeroCheck=true;
		boolean zeroCheck=true;
		arr[0][0]=1;
		arr[0][1]=0;
		arr[1][0]=0;
		arr[1][1]=2;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				if(i==j) {
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
			System.out.println("Digonal or scalar matrix");
		}
		else {
			System.out.println("Simple matrix");
		}

	}

}
