
public class SwapString {

	public static void main(String[] args) {
		String s1="java";
		String s2="world";
		
		int lenght1=s1.length();
		int lenght2=s2.length();
		
		s1=s1+s2;
		s2=s1.substring(0,lenght1);
		s1=s1.substring(lenght1);
		
		System.out.println(s1 +" "+ s2);
		
	}
	
	

}
