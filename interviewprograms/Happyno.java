package class1;

import java.util.HashSet;

public class Happyno {
	    public boolean number(int n) {
	        HashSet<Integer> set = new HashSet<>();
	        while(n != 1){
	            if(set.contains(n)){
	                return false;
	            }
	            set.add(n);
	            n = sum(n);
	        }
	        return true;
	    }
	    
	    public int sum(int n){
	        int sum = 0;
	        while(n > 0){
	            sum += (n%10) * (n%10);
	            n = n/10;
	        }
	        return sum;
	    }
	  public static void main(String[] args) {
		Happyno obj=new Happyno();
		boolean ar=obj.number(10);
		System.out.println(ar);
		
	}
	}
	


