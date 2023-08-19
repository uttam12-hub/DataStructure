
public class MoveZero {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
        int a[]={3,0,4,0,3,1,5};
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0 && a[j]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
               
            }
            if(a[j]!=0) {
            	j++;
            }
        }
        
        for(int b:a)
        System.out.print(b+ " ");
	}

}
