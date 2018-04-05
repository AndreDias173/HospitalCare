package hospital;
import java.util.ArrayList;
import java.util.Date;

public class Prescricao {

	//Atributos dos relacionamentos
	protected Medico medico;
	protected Doente doente;
	protected Medicamento medicamento;
	protected ArrayList<HorarioToma>  horariosToma;
		
	//Atributos da Prescricao
	protected Date data;
		
		
	//construtores
	public Prescricao() {	
		horariosToma = new ArrayList<HorarioToma>();
	}

		
	public Prescricao(Medico medico, Doente doente, Medicamento medicamento, ArrayList<HorarioToma> horariosToma, Date data) {
			this.medico = medico;
			this.doente = doente;
			this.medicamento= medicamento;
			this.horariosToma = horariosToma;
			this.data = data;
	}
		
}
