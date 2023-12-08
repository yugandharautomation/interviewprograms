import java.util.Arrays;

public class Arithmetic {

	
	public boolean ap(int a[]) {
		
 Arrays.sort(a);
 int i;
 int d=(a[1]-a[0]) ;
	 for( i=2;i<a.length;i++) {
		 if(a[i]-a[i-1]!=d)
		 {
		return false;
		 
	 }
	 
	 
	 }
	 
	return true ;
	
 }
public static void main(String[] args) {
	Arithmetic obj= new Arithmetic();
	int a[]= {9,3,6,10};
	boolean ar=obj.ap(a);
	System.out.println(ar);
}
}
