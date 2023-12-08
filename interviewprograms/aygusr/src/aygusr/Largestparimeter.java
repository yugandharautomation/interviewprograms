package aygusr;

import java.util.Arrays;

public class Largestparimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,1,2};
		int n=a.length;
		Arrays.sort(a);
		for(int i=n-3;i>=0;i--) {
			if(a[i]+a[i+1]>a[i+2])
			{
				int parimeter = a[i]+a[i+1]+a[i+2];
				System.out.println(parimeter);
			}
		}

	}

}
