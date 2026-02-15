import java.util.Scanner;
import java.lang.reflect.Array;
public class reversestring {
    public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of array:");
	    int size =scan.nextInt();
		String[] arr=new String[size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextLine();
		}
		for(int i=size-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
