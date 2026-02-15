import java.util.Scanner;
public class maxarray {
	public static void main(String [] args) {
		int size,max;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		size =scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		max=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print("Maximum value is:"+max);
	}
}

