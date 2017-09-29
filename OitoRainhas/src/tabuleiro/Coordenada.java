package tabuleiro;

public class Coordenada {
	
	private boolean rainha;
	private int x;
	private int y;
	
	public Coordenada(){
		this.rainha = false;
	}
	
	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
		this.rainha = false;
	}
	
	public boolean isRainha() {
		return rainha;
	}

	public void setRainha(boolean rainha) {
		this.rainha = rainha;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
//		str.append("(" + this.getX());
//		str.append("," + this.getY() + ")");
		if(this.isRainha()){
			str.append(" R ");
		}else{
			str.append(" - ");
		}
		return str.toString();
	}
}
