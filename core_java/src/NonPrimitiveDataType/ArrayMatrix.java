package NonPrimitiveDataType;

public class ArrayMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int [3][3];
		  arr[0][0]=1;
		  arr[0][1]=0;
		  arr[0][2]=0;
		  
		  arr[1][0]=0;
		  arr[1][1]=1;
		  arr[1][2]=0;
		  
		  arr[2][0]=0;
		  arr[2][1]=0;
		  arr[2][2]=1;
		  
		boolean oneCheck=true;
		boolean zeroCheck=true;
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				if(i==j) {
					if(arr[i][j]!=1){
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


