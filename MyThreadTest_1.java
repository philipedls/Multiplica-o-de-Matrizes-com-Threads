package ufpb.atividade.thread;

public class MyThreadTest_1 {
	
	public static void main(String[] args){
		
		int [][] a = new int[][]{{2,3,5},{4,4,7},{56,0,2}};
		int [][] b = new int[][]{{3,4,6},{4,6,7},{12,54,69}};
		
		int [][] r = calculaProduto(a, b);
		
		for(int i=0; i<r.length;i++){
			for(int j=0; j< r[i].length;j++){
				if(j+1 == r[i].length){
					System.out.println(" "+r[i][j]);
				
				}else {
					System.out.print(" "+r[i][j]+" ");
				}
				
			}
		}
	
	}
	
	public static int[][] calculaProduto(int[][] a, int[][] b) {

	    if (a[0].length != b.length) throw new RuntimeException("Dimensões inconsistentes. Impossível multiplicar as matrizes");

	    int[][] result = new int[ a.length ][ b[0].length ];

	    for (int i = 0; i < a.length; i++)
	        for (int j = 0; j < b[0].length; j++) {
	            int somatoria = 0;
	            for (int k = 0; k < a[0].length; k++) {
	                int produto = a[i][k] * b[k][j];
	                somatoria += produto;
	            }
	            result[i][j] = somatoria ;
	        }
	    return result ;
	}

}
