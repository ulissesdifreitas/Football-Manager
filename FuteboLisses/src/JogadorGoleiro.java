
public class JogadorGoleiro extends Jogador {
	
	private int reflexos;
	private int altura;
	
	public JogadorGoleiro(String nomeJogador) {
		this.setNome(nomeJogador);
	}
	
	public int getHabilidade() {
		return ((habilidade*5) + (((int)altura*100))*2) + (reflexos*3) / 10;  //correção: requisito possuia um ")" a mais
	}
	
	public JogadorGoleiro(String nomeJogador, int idadeJogador, int habilidadeJogador, int reflexoJogador, int alturaJogador) {
		this.setNome(nomeJogador);
		this.idade = idadeJogador;
		this.habilidade = habilidadeJogador;
		this.reflexos = reflexoJogador;
		this.altura = alturaJogador;
	}
	
}
