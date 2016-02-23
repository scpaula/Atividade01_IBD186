package br.gov.sp.fatec;

public class PessoaJuridica implements Pessoa{

	private String cnpj;
	
	public PessoaJuridica(){
	}
	
	public void setDocumento(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String getDocumento() {
		return "CNPJ: " + cnpj;
	}
	
}
