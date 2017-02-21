package ufpb.atividade.thread;

public class Elemento{
	
	private int num;
	private boolean flag;
	
	public Elemento(int num){
		this.num = num;
		setFlag(false);
		
	}
	
	public void setNum(int num){
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}

