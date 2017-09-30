import java.util.LinkedList;
import tabuleiro.Coordenada;
import tabuleiro.Tabuleiro;

public class Principal {
	
	LinkedList<No> fila;
	Arvore arvore;
	public Principal() {
		arvore = new Arvore();
		fila = new LinkedList<>();
		
				
		No raiz = new No();
		arvore.insert(raiz); // tá estranho
		fila.add(raiz);
		
		
		while (!fila.isEmpty()){
			No atual = fila.removeFirst();
			atual.getTabuleiro().printTabuleiro();
			
			if(atual.isSolucao()){
				System.out.println("Solução do problema");
				atual.getTabuleiro().printTabuleiro();
				System.out.println("\nEncontrou a solução!");
				break;
			}else{
				if(!atual.poda()){
					Tabuleiro tabuleiro = null, novoTabuleiro = null;
					int linha;
					No novo;
					
					tabuleiro = atual.getTabuleiro();
					
					linha = tabuleiro.getQuantRainhas();
					System.out.println();
					System.out.println("Profundidade da árvore " + linha);
					System.out.println();

					for(int i = 0; i < 8; i++){
						
						novoTabuleiro = new Tabuleiro();
						
						for (Coordenada coord : atual.getTabuleiro().getRainhas()) {
							novoTabuleiro.addRainha(coord.getX(), coord.getY());
						}
						
						
						novoTabuleiro.addRainha(linha, i);
						
						
						
//						arvore.insert(atual, novoTabuleiro);
						novo = new No(novoTabuleiro);
						novo.setPai(atual);
						atual.setFilhos(novo);
						fila.add(novo);
						
						System.out.println("Tabuleiro gerado");
						novo.getTabuleiro().printTabuleiro();
						System.out.println();
						
					}
					
					
					
				}

			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		new Principal();
	}
	
	
}
