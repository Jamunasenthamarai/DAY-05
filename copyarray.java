import java.util.Scanner;
public class copyarray {
    public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of array:");
	    int size =scan.nextInt();
		int[] a=new int[size];
		int[] b=new int[a.length];
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<size;i++) {
			b[i]=a[i];
		}
		System.out.println("Copied array:");
		for(int i=0;i<size;i++) {
			System.out.print(b[i]);
		}
	}
}
