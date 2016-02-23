package br.gov.sp.fatec;

public class PessoaFisica implements Pessoa{
	
	private String cpf;
	
	public PessoaFisica(){
	}
	
	public void setDocumento(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String getDocumento() {
		return "CPF: " + cpf;
	}
	
}
