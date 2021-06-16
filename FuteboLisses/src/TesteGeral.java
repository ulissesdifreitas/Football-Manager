
public class TesteGeral {
	public static void main(String[] args) {
		
		Time Flamengo = new Time("Flamengo");
		System.out.println(Flamengo.getNome());
		
		Time Palmeiras = new Time("Palmeiras");
		System.out.println(Palmeiras.getNome());
		
		Jogador Romario = new Jogador("Romário", 35, 100);
		System.out.println(Romario.getNome());
		System.out.println(Romario.idade);
		System.out.println(Romario.getHabilidade());
		
		JogadorAtacante Edmundo = new JogadorAtacante("Edmundo Animal", 35, 100, 100, 90);
		System.out.println(Edmundo.getHabilidade());
		
		JogadorDefesa Gamarra = new JogadorDefesa("Gamarra", 36, 95, 90, 90);
		System.out.println(Gamarra.getHabilidade());
		
		JogadorGoleiro Taffarel = new JogadorGoleiro("Taffarel", 40, 92, 98, 97);
		System.out.println(Taffarel.getHabilidade());
		
		Partida Jogo1 = new Partida(Palmeiras, Flamengo);
		System.out.println(Jogo1.getPlacar());
	}
}
