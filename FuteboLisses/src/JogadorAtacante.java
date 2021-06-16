
public class JogadorAtacante extends Jogador {
	
	private int velocidade;
	private int tecnica;
	
	public JogadorAtacante(String nomeJogador) {
		this.setNome(nomeJogador);
		
	}
	public int getHabilidade() {
		return ((habilidade*5)) + (velocidade*2) + (tecnica*3) / 10;
	}
	
	public JogadorAtacante(String nomeJogador, int idadeJogador, int habilidadeJogador, int velocidadeJogador, int tecnicaJogador){
		this.setNome(nomeJogador);
		this.idade = idadeJogador;
		this.habilidade = habilidadeJogador;
		this.velocidade = velocidadeJogador;
		this.tecnica = tecnicaJogador;
	}
}