import java.util.Scanner;
class Main{
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the array size:");
	int size=scan.nextInt();
	int[] arr=new int[size];
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
		sum=sum+arr[i];
	}
	System.out.print("The sum of array element is:"+sum);
}
}