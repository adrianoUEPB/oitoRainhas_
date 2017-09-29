package tabuleiro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	private Coordenada[][] tabuleiro;
	private int quantRainhas;
	private List<Coordenada> rainhas;
	
	public Tabuleiro() {
		this.tabuleiro = new Coordenada[8][8];
		this.rainhas = new ArrayList<>();
		this.quantRainhas = 0;
		this.iniciarTabuleiro();
	}
	
	private void iniciarTabuleiro(){

		for(int i = 0; i < tabuleiro.length; i++){
			for(int j = 0; j < tabuleiro[0].length; j++){
				this.tabuleiro[i][j] = new Coordenada(i, j);
			}
		}
			
	}
	
	public void printTabuleiro(){
		BufferedWriter escrita = null;
		try {
//			BufferedReader leitura = new BufferedReader(new FileReader("/src/tabuleiro.txt"));
			escrita = new BufferedWriter(new FileWriter("./src/tabuleiro.txt", true));
			
			escrita.append("============Tabuleiro=============\n");
			
			escrita.append("     a   b   c   d   e   f   g   h\n");
			
			System.out.println("     a   b   c   d   e   f   g   h");
			for(int i = 0; i < tabuleiro.length; i++){
				System.out.print(8-i + " |");
				escrita.append(8-i + " |");
				for(int j = 0; j < tabuleiro[0].length; j++){
					
					System.out.print(" "+tabuleiro[i][j].toString() + "");
					
					escrita.append(" "+tabuleiro[i][j].toString() + "");
				}
				System.out.println();
				escrita.append("\n");
			}
			escrita.append("==================================");
			escrita.append("\n\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				escrita.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public Coordenada getCoordenada(int x, int y){
		return this.tabuleiro[x][y];
	}
	
	public void addRainha(int x, int y){
		Coordenada coordenada = new Coordenada(x, y);
		coordenada.setRainha(true);
		this.setQuantRainhas();
		this.rainhas.add(new Coordenada(x, y));
		this.tabuleiro[x][y] = coordenada;
	}
	
	public Coordenada[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Coordenada[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public int getQuantRainhas() {
		return quantRainhas;
	}

	private void setQuantRainhas() {
		this.quantRainhas++;
	}
	
	public int size(){
		return this.tabuleiro.length;
	}

	public List<Coordenada> getRainhas() {
		return rainhas;
	}

	public void setRainhas(List<Coordenada> rainhas) {
		this.rainhas = rainhas;
	}
	
}
