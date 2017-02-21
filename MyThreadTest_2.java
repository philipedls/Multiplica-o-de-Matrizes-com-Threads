package ufpb.atividade.thread;

public class MyThreadTest_2 {
	
	public static void main(String[] args){
		
		Elemento[][] matriz1 = new Elemento[][]{{new Elemento(3),new Elemento(4), new Elemento(3)},
			{new Elemento(56),new Elemento(0), new Elemento(43)},
			{new Elemento(34),new Elemento(12), new Elemento(18)}};
			
			
		
		Elemento[][] matriz2 = new Elemento[][]{{new Elemento(8),new Elemento(9), new Elemento(10)},
			{new Elemento(4),new Elemento(3), new Elemento(11)},
			{new Elemento(22),new Elemento(17), new Elemento(18)}};
			
			
		Elemento[][] r = new Elemento[3][3];
		
		MyThread thread1 = new MyThread(matriz1, matriz2, r, "1");
		MyThread thread2 = new MyThread(matriz1, matriz2, r, "2");
		MyThread thread3 = new MyThread(matriz1, matriz2, r, "3");
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try{
			t1.join();
			t2.join();
			t3.join();
		} catch(Exception e){
			
		}
		
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

}
