public class linearsearch {
    public static void main(String []args){
        int a[]={10,20,30,40,50};
        int key=40;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.print(i);
            }
        }
    }
}
