package hospital;

import java.util.Date;

public class Entrada {
	private FuncionarioAdministrativo funcionario;
	private Doente doente;
	
	private Date data_hora;

	public Entrada(FuncionarioAdministrativo funcionario, Doente doente, Date data_hora) {
		super();
		this.funcionario = funcionario;
		this.doente = doente;
		this.data_hora = data_hora;
	}
	
}
