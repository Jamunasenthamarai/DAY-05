import java.util.Scanner;

public class minarray {
    public static void main(String [] args) {
		int size,min;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		size =scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		min=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print("Maximum value is:"+min);
	}
}
