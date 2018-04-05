package hospital;

public class PrescricaoVerbalTUnica extends Prescricao {
	private Enfermeiro enfermeiro;
	private AutorizacaoPrescricao autorizacao;

	public PrescricaoVerbalTUnica() {}
	
	public PrescricaoVerbalTUnica(Enfermeiro enfermeiro, AutorizacaoPrescricao autorizacao) {
		this.enfermeiro = enfermeiro;
		this.autorizacao = autorizacao;
	}

	


}
