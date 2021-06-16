
public class Time extends Jogador {
	private String nome;
	private Jogador jogadores[];
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Time() {
		
	}
	
	public Time(String nomeTime) {
		this.nome = nomeTime;
		jogadores = new Jogador[11];
		for(int i = 0; i < 11; i++) {
			jogadores[i] = new Jogador();
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getResultados() {
		return "O time venceu " + vitorias + " partidas! "
				+ "" + "Empatou " + empates + " vezes, "
						+ "" + "Derrotas: " + derrotas  ;	
	}
	public void imprimeJogadores() {
		System.out.println(jogadores);
	}
	
	public void somaVitoria() {
		
	}
    
    public void somaDerrota() {
		
	}
    
    public void somaEmpate() {
		
	}
    public void insJogador(Jogador pJog) {
    	
    }
    
}
