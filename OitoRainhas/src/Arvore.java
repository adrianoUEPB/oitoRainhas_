import tabuleiro.Tabuleiro;

public class Arvore {
	private No raiz;
	
	public Arvore(){
		this.raiz = new No();
	}
	
	public void insert(Tabuleiro tabuleiro) {
		this.insert(this.raiz, tabuleiro);
	}
	
	public void insert(No no, Tabuleiro tabuleiro) {
		
		if (this.raiz == null) {
			this.raiz = new No(tabuleiro);
		} else {
			
			No novoNo = new No(tabuleiro);
			novoNo.setPai(no);
			
			no.setFilhos(novoNo);
			
		}
	}
}
