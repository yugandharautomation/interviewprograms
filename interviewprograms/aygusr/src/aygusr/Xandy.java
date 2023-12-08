package aygusr;

public class Xandy {

	
	public int nearestValidPoint(int x, int y, int[][] points) {

        int min=Integer.MAX_VALUE, index=-1, i;


        for ( i=0;i<points.length;i++){
            if (x==points[i][0] ||  y==points[i][1]){
                int d = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (d<min){
                    min=d;
                    index=i;
                }
            }

        }

        return  index;

    }

    public static void main(String[] args) {
        int a= 3;
        int b =4;
        int[][] d= {{1, 2}, {3, 1}, {2, 4}, {2, 3},{4,4}};
        Xandy obj = new Xandy();
        int index  = obj.nearestValidPoint(a,b ,d);
        System.out.println(index);
}
}      
	      
	        
	    
		
		
	

