
public class JogadorDefesa extends Jogador {
	
	private int cobertura;
	private int desarme;
	
	public JogadorDefesa(String nomeJogador) {
		this.setNome(nomeJogador);
	}
	
	public int getHabilidade() {
		return ((habilidade*5) + (cobertura*3) + (desarme*2)) / 10;
	}
	
	public JogadorDefesa(String nomeJogador, int idadeJogador, int habilidadeJogador, int coberturaJogador, int desarmeJogador) {
		this.setNome(nomeJogador);
		this.idade = idadeJogador;
		this.habilidade = habilidadeJogador;
		this.cobertura = coberturaJogador;
		this.desarme = desarmeJogador;

	}
}
