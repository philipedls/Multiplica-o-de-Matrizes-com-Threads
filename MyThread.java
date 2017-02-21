package ufpb.atividade.thread;

public class MyThread implements Runnable{
	
	private Elemento[][] matriz1;
	private Elemento[][] matriz2;
	private Elemento[][] matrizResultante;
	String nome;
	
	public MyThread(Elemento [][] matriz1, Elemento [][] matriz2, Elemento [][] matrizResultante ,String nome) {
		this.matriz1 = matriz1;
		this.matriz2 = matriz2;
		this.nome = nome;
	}
	
	public Elemento[][] getMatriz1(){
		return matriz1;
	}

	public Elemento[][] getMatriz2(){
		return matriz2;
	}
	
	public Elemento[][] getMatrizResultante(){
		return matrizResultante;
	}
	
	@Override
	public void run() {
		
		calculaProduto(getMatriz1(), getMatriz2(), getMatrizResultante());
		
	}
	
	public void calculaProduto(Elemento[][] a, Elemento[][] b,  Elemento[][] r) {
		
		Elemento[][] result = r;
		
	    if (a[0].length != b.length) throw new RuntimeException("Não foi possivel multiplicar as matrizes");

	    for (int i = 0; i < a.length; i++){
	    	
	        for (int j = 0; j < b[0].length; j++) {
	        	
	        	Elemento somatoria = new Elemento(0);
	        	int aux = 0;
	        	
	            for (int k = 0; k < a[0].length; k++) {
	               if(a[i][k].isFlag() == false){
	            	   aux += a[i][k].getNum() * b[k][j].getNum();
		                somatoria.setNum(aux);
		                
		                a[i][k].setFlag(true);		//faz com quer outra thread não mexa nessa posição!
	               }
	            }
	            result[i][j] = somatoria ;
	        }
	        
	    }
	
	}
}
