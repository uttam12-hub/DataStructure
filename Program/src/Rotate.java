
public class Rotate {

	public static void main(String[] args) {
		int [] num= {4,5,9,3};
		
		
			for(int i=0;i<2;i++) {
			int last=num[num.length-1];
			
			for(int j=num.length-1;j>0;j--) {
				num[j]=num[j-1];
			}
			num[0]=last;
			}
			
		
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);		
	}

	}
	
	

}
