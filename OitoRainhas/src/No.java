import java.util.ArrayList;
import java.util.List;

import tabuleiro.Tabuleiro;

public class No {
	private Tabuleiro tabuleiro;
	private No pai;
	private List<No> filhos;
	public No() {
		this.tabuleiro = new Tabuleiro();
		this.pai = null;
		this.filhos = new ArrayList<>();
	}
	
	public No(Tabuleiro tabuleiro){
		this.tabuleiro = tabuleiro;
		this.pai = null;
		this.filhos = new ArrayList<>();
	}

	public Tabuleiro getTabuleiro() {
		return this.tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public No getPai() {
		return pai;
	}

	public void setPai(No pai) {
		this.pai = pai;
	}

	public List<No> getFilhos() {
		return filhos;
	}

	public void setFilhos(No filho) {
		this.filhos.add(filho);
	}
	
	public boolean poda(){
		
		for( int i = 0; i < tabuleiro.size(); i++){
			for( int j = 0; j < tabuleiro.size(); j++){
				
				if(tabuleiro.getCoordenada(i, j).isRainha()){
					//tem rainha
					
					/*
					 * Cima
					 */
					int x = tabuleiro.getCoordenada(i, j).getX() - 1;
					int y = tabuleiro.getCoordenada(i, j).getY();
					while(x >= 0){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return true; //Porque se existir rainha, não é a solução
						}
						x--;
					}
					
					/*
					 * Baixo
					 */
					x = tabuleiro.getCoordenada(i, j).getX() + 1;
					y = tabuleiro.getCoordenada(i, j).getY();
					while(x < 8){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return true; //Porque se existir rainha, não é a solução
						}
						x++;
					}
					
					/*
					 * Esquerda
					 */
					x = tabuleiro.getCoordenada(i, j).getX();
					y = tabuleiro.getCoordenada(i, j).getY() - 1;
					while(y >= 0){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return true; //Porque se existir rainha, não é a solução
						}
						y--;
					}
					
					/*
					 * Direita
					 */
					x = tabuleiro.getCoordenada(i, j).getX();
					y = tabuleiro.getCoordenada(i, j).getY() + 1;
					while(y < 8){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return true; //Porque se existir rainha, não é a solução
						}
						y++;
					}
					
					/*
					 * Direita superior
					 */
					x = tabuleiro.getCoordenada(i, j).getX() - 1;
					y = tabuleiro.getCoordenada(i, j).getY() + 1;
					while(x >= 0 && y < 8){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return false; //Porque se existir rainha, não é a solução
						}
						x--;
						y++;
					}
					
					/*
					 * Esquerda inferior
					 */
					x = tabuleiro.getCoordenada(i, j).getX() + 1;
					y = tabuleiro.getCoordenada(i, j).getY() - 1;
					while(x < 8 && y >= 0){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return true; //Porque se existir rainha, não é a solução
						}
						x++;
						y--;
					}
					
					/*
					 * Esquerda superior
					 */
					x = tabuleiro.getCoordenada(i, j).getX() - 1;
					y = tabuleiro.getCoordenada(i, j).getY() - 1;
					while(x >= 0 && y >= 0){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return true; //Porque se existir rainha, não é a solução
						}
						x--;
						y--;
					}
					
					/*
					 * direita inferior
					 */
					x = tabuleiro.getCoordenada(i, j).getX() + 1;
					y = tabuleiro.getCoordenada(i, j).getY() + 1;
					while(x < 8 && y < 8){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return true; //Porque se existir rainha, não é a solução
						}
						x++;
						y++;
					}
				}
			}
		}
		
		return false;
	}
	
	public boolean isSolucao(){
		if(this.tabuleiro.getQuantRainhas() < 8)
			return false;
		
		for( int i = 0; i < tabuleiro.size(); i++){
			for( int j = 0; j < tabuleiro.size(); j++){
				
				if(tabuleiro.getCoordenada(i, j).isRainha()){
					//tem rainha
					
					/*
					 * Cima
					 */
					int x = tabuleiro.getCoordenada(i, j).getX() - 1;
					int y = tabuleiro.getCoordenada(i, j).getY();
					while(x >= 0){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return false; //Porque se existir rainha, não é a solução
						}
						x--;
					}
					
					/*
					 * Baixo
					 */
					x = tabuleiro.getCoordenada(i, j).getX() + 1;
					y = tabuleiro.getCoordenada(i, j).getY();
					while(x < 8){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return false; //Porque se existir rainha, não é a solução
						}
						x++;
					}
					
					/*
					 * Esquerda
					 */
					x = tabuleiro.getCoordenada(i, j).getX();
					y = tabuleiro.getCoordenada(i, j).getY() - 1;
					while(y >= 0){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return false; //Porque se existir rainha, não é a solução
						}
						y--;
					}
					
					/*
					 * Direita
					 */
					x = tabuleiro.getCoordenada(i, j).getX();
					y = tabuleiro.getCoordenada(i, j).getY() + 1;
					while(y < 8){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return false; //Porque se existir rainha, não é a solução
						}
						y++;
					}
					
					/*
					 * Direita superior
					 */
					x = tabuleiro.getCoordenada(i, j).getX() - 1;
					y = tabuleiro.getCoordenada(i, j).getY() + 1;
					while(x >= 0 && y < 8){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return false; //Porque se existir rainha, não é a solução
						}
						x--;
						y++;
					}
					
					/*
					 * Esquerda inferior
					 */
					x = tabuleiro.getCoordenada(i, j).getX() + 1;
					y = tabuleiro.getCoordenada(i, j).getY() - 1;
					while(x < 8 && y >= 0){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return false; //Porque se existir rainha, não é a solução
						}
						x++;
						y--;
					}
					
					/*
					 * Esquerda superior
					 */
					x = tabuleiro.getCoordenada(i, j).getX() - 1;
					y = tabuleiro.getCoordenada(i, j).getY() - 1;
					while(x >= 0 && y >= 0){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return false; //Porque se existir rainha, não é a solução
						}
						x--;
						y--;
					}
					
					/*
					 * direita inferior
					 */
					x = tabuleiro.getCoordenada(i, j).getX() + 1;
					y = tabuleiro.getCoordenada(i, j).getY() + 1;
					while(x < 8 && y < 8){
						if(tabuleiro.getCoordenada(x, y).isRainha()){
							return false; //Porque se existir rainha, não é a solução
						}
						x++;
						y++;
					}
				}
			}
		}
		
		return true;
	}
	
}
