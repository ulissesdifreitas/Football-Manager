
public class Jogador {
	
	private String nome;
	protected int idade;
	protected int habilidade;
	private int gols;
	private int numeroCamisa;



	public Jogador() {	
		gols = 0;
	}
	
public Jogador(String nomeJogador, int idadeJogador, int habilidadeJogador) { 
	this.nome = nomeJogador;
	this.idade = idadeJogador;
	this.habilidade = habilidadeJogador;
	gols = 0;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getHabilidade() {
	return habilidade;
}

public int getGols() {
	return gols;
}
	public void somaGol() {
		gols = gols + 1;
	}	
}