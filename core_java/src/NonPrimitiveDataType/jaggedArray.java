package NonPrimitiveDataType;

public class jaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int [3][];
		int sum=0;
		
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[4];
		
		
//		arr[0][0]=10;
//		arr[0][1]=20;
//		arr[0][2]=30;
//		
//		arr[1][0]=40;
//		arr[1][1]=50;
//		
//		arr[2][0]=60;
//		arr[2][1]=70;
//		arr[2][2]=80;
//		arr[2][3]=90;
	
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=arr.length;
				sum=sum+arr[i][j];
			}
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("sum:"+sum);
	

//    	if(sum%2==0) {
//		System.out.println("even");
//    	}
//	    else {
//		System.out.println("odd");	
	
		boolean flage=false;
		for(int i=0; i<sum; i++) {
			if(i%sum==0) {
				flage=true;
			}
		}
		if(flage==false) {
			System.out.println("prime:"+sum);
		}
		else {
			System.out.println("not prime");
		
	}
	}
}


