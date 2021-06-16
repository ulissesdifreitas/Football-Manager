import java.util.Date;

public class Partida {
	private Date data = new Date();
	private Time timeCasa;
	private Time timeVisitante;
	private int placarCasa = 0;
	private int placarVisitante = 0;

	public Partida(Time timeDaCasa, Time timeVisitante) {

		this.timeCasa = timeDaCasa;
		this.timeVisitante = timeVisitante;
	}

	public Partida(Date diaDeJogo, Time timeDaCasa, Time timeVisitante) {

		this.data = diaDeJogo;
		this.timeCasa = timeDaCasa;
		this.timeVisitante = timeVisitante;
	}
	public void golCasa() {
		placarCasa = placarCasa + 1;
	}
	
	public void golVisitante() {
		placarVisitante = placarVisitante + 1;
	}
	
	public String getPlacar() {
		return   timeCasa + " = " + placarCasa + " x " + placarVisitante + " = " + timeVisitante;
	}

}
