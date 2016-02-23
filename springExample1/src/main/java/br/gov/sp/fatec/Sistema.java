package br.gov.sp.fatec;

/*
 * @author Sonia
 */

public class Sistema {
	
	private Pessoa pessoa;
	
	
	public Sistema() {
	}
	
	public String consultar() {
		return "[ <" + pessoa.getDocumento() + "> ]";
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
