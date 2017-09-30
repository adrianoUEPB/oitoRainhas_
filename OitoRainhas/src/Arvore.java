import tabuleiro.Tabuleiro;

public class Arvore {
	private No raiz;
	
	public Arvore(){
		this.raiz = new No();
	}
	
	public void insert(No no) {
		
		if (this.raiz == null) {
			this.raiz = new No();
		} else {
			
			No novoNo = new No();
			novoNo.setPai(no);
			
			no.setFilhos(novoNo);
			
		}
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
