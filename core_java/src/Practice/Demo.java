package Practice;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num=10;
//		System.out.println(num);
		
//		int num1=10;
//		int num2=20;
//		
//		System.out.println(num1>num2 && num2<num1);
//		System.out.println(num2>num1 || num1<num2);
		
//		for(int i=0; i<=10; i++) {
//			if(i==3) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int i=10;
//		float f=i;
//		
//		System.out.println("f:"+f);
		
//		float f=12.0f;
//		int i=(int)f;
//		System.out.println("f:"+f);
//		System.out.println("i:"+i);
		
		
//		prime number
		
//		int number=53;
//		boolean flage=false;
//		for(int i=1; i<number; i++) {
//			if(number%i==0) {
//				flage=true;
//			}
//			}
//		if(flage) {
//			System.out.println("prime number");
//		}
//		else {
//			System.out.println("not prime");
//		}
		
//		int sum=0;
//		int counter=0;
//		for(int i=1; i<=10; i++) {
//			if(i==1) {
//				continue;
//			}
//			boolean flage=false;
//			for(int j=2; j<i; j++) {
//				if(i%j==0) {
//					flage=true;
//				}
//			}
//			if(flage==false) {
//				System.out.println("prime number:"+i);
//				sum=sum+i;
//				counter++;
//			}
//			else {
//			System.out.println("not prime:"+i);			}
//		}
//		    System.out.println("counter:"+counter);
//			System.out.println("sum:"+sum);
//			
//			if(sum%2==0) {
//				System.out.println("even number");
//			}
//			else {
//				System.out.println("odd number");
//			}
//			
//		}
//	}
//		int number=2;
//		int sum=0;
//		 int counter=0;
//		 while(counter<251) {
//		 boolean flage=false;
//		 for(int i=2; i<number; i++) {
//			 if(number%i==0) {
//				 flage=true;
//			 }
//		 }
//		 if(flage==false) {
//			 System.out.println("prime:"+number);
//			 sum=sum+number;
//			 counter++;
//		 }
//		 number++;
//		 }
//	
//			System.out.println("sum:"+sum);	
//			System.out.println("counter:"+counter);
//			
//			 }
		
//		}
//		int [] arr=new int[4];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		
//		for(int i=0; i<=arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		int []arr=new int [5];
//		for(int i=0; i<5; i++) {
//			System.out.println(i);
//		}
		
//		int []arr= {4,6,77,89,4};
//		int num=-2147483648;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>num) {
//				num=arr[i];
//			}
//		}
//			System.out.println(num);
//		}
		
//		int []arr= {47,879,874,99};
//		int num=2147483647;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]<num) {
//				num=arr[i];
//			}
//		}
//		System.out.println(num);
//	}
//}
//		boolean zeroCheck=true;
//		boolean oneCheck=true;
//		int [][]arr=new int [2][2];
//		arr[0][0]=1;
//		arr[0][1]=0;
//		arr[1][0]=0;
//		arr[1][1]=1;
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length; j++) {
//				if(i==j) {
//					if(arr[i][j]!=1) {
//					oneCheck=true;
//
//					}
//				}
//				else {
//					if(arr[i][j]!=0) {
//						zeroCheck=true;
//						
//					}
//				}
//			}
//		}
//		if(zeroCheck && oneCheck) {
//			System.out.println("identity matrix");
//		}
//		else {
//			System.out.println("non identity matrix");
//		}			
//			}
		
//	 int sum=0;
//	 int counter=0;
//	 int number=2;
//	 
//	 while(counter<78) {
//	 boolean flage=false;
//	 for(int i=2; i<number;i++) {
//		 if(number%i==0) {
//			 flage=true;
//			 break;
//		 }
//	 }	 
//		  
//	 
//	 if(flage==false) {
//		 sum=sum+number;
//		 counter++;
//		 System.out.println("prime:"+number);
//	 }
//	 number++;
//	 }
//	System.out.println("sum:"+sum);
//	System.out.println("counter:"+counter);
//	
//		int sum=0;
//		int [][]arr=new int[3][];
//		arr[0]=new int [1];
//		arr[1]=new int [4];
//		arr[2]=new int [5];
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j]=arr.length;
//			}
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//				sum=sum+arr[i][j];
//			}
//			System.out.println();
//		}
//		System.out.println("sum:"+sum);
		
//	for(int i=1; i<=3; i++) {
//		for(int j=1; j<i; j++) {
//			System.out.print(" ");
//		}
//		System.out.println(" * ");
//	}
//	
		
//		for(int i=0; i>=3; i++) {
//			for(int j=0; j<i*3; j++) {
//				System.out.print(" ");
//			}
//			System.out.println("*");
//		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	 }
}
	 
	 
	

	
		
		



		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			 
		 
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	


