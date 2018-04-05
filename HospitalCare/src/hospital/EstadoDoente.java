package hospital;

public class EstadoDoente {

	private Entrada entrada;
	private Medico medico;
	private Enfermeiro enfermeiro;
	
	
	private String estado;


	public EstadoDoente(Entrada entrada, Medico medico, String estado) {
		this.entrada = entrada;
		this.medico = medico;
		this.estado = estado;
	}
	
	
}
