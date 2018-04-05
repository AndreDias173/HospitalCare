package hospital;

import java.util.Date;

public class PreparacaoMedicacao {

	private Enfermeiro enfermeiro;
	private HorarioToma horarioToma;
	
	private Date data_hora;

	public PreparacaoMedicacao(Enfermeiro enfermeiro, HorarioToma horarioToma, Date data_hora) {
		this.enfermeiro = enfermeiro;
		this.horarioToma = horarioToma;
		this.data_hora = data_hora;
	}
	

}
