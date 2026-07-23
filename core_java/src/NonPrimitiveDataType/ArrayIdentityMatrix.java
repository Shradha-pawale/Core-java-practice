package NonPrimitiveDataType;

public class ArrayIdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int [2][2];
		     arr[0][0]=1;
		     arr[0][1]=0;
		     arr[1][0]=0;
		     arr[1][1]=1;
		
		boolean zeroCheck=true;
		boolean oneCheck=true;
			
    	for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				if(i==j) {
					if(arr[i][j]!=1) {
						oneCheck=false;
					}
				}
				else {
					if(arr[i][j]!=0) {
						zeroCheck=false;
					}
				}
			}
		}
			if(oneCheck && zeroCheck) {
				System.out.println("identity matrix");
			}
			else {
				System.out.println("non identity matrix");
			}
		}

	}


