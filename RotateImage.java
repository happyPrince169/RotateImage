package Codefights;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1, 2, 3},							
					 {4, 5, 6}};						
		int[][] rs = rotateImage(a);					
		for(int i=0; i<a[0].length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(rs[i][j]+"  ");
			}
			System.out.println();
		}

	}
	
	static int[][] rotateImage(int[][] a) {
	    int[][] rs = new int[a[0].length][a.length];
	    int x= a.length-1; 
	    int y= 0;
	    for(int i=0; i<a[0].length; i++){
	        for(int j=0; j<a.length; j++){
	            rs[i][j]= a[x][y];
	            x--;
	        } 
	        y++;
	        x= a.length-1;
	    }
	    return rs;
	}


}
