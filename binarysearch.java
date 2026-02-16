public class binarysearch {
    public static void main(String [] args) {
		int [] a={50,80,10,20,40};
        int key=40;
        int low=0;
        int high=a.length-1;
        int ans=0;
        for(int i=0;i<a.length;i++){
            int mid=(low+high)/2;
            if(a[mid]==key){
                ans =mid;
            }
            else if(a[mid]>key){
                high=mid-1;
            }
            else if(a[mid]<key){
                low=mid+1;
            }
        }
        System.out.print(ans);
	}
}
