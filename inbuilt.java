import java.util.Arrays;
import java.util.Scanner;

public class inbuilt {
    public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of array:");
	    int size =scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.print("Array:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.print("Sorted:"+Arrays.toString(arr));
		int[] copy=Arrays.copyOf(arr, size);
		System.out.print("Copied:"+Arrays.toString(copy));
	}
}
