package NonPrimitiveDataType;
import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int counter=0;
		System.out.println("please enter the rows::");
		Scanner scan=new Scanner(System.in);
		int rows=scan.nextInt();
		
		int[][] arr=new int [rows][];
		for(int i=0; i<arr.length; i++) {
			System.out.println("row:"+i);
			int column=scan.nextInt();
			arr[i]=new int[column];
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
			System.out.println("row:"+i+"coloumn:"+j);
			int element=scan.nextInt();
			arr[i][j]=element;
			sum=sum+arr[i][j];
			counter++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("sum:"+sum);
		System.out.println("counter:"+counter);

	}

	}

