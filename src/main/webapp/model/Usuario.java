package main.webapp.model;

public class Usuario {
	
	private String senha;	
	private String tipo_user;
	private int pessoaFisica_idPessoa;
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getTipo_user() {
		return tipo_user;
	}
	
	public void setTipo_user(String tipo_user) {
		this.tipo_user = tipo_user;
	}

	public int getPessoaFisica_idPessoa() {
		return pessoaFisica_idPessoa;
	}

	public void setPessoaFisica_idPessoa(int pessoaFisica_idPessoa) {
		this.pessoaFisica_idPessoa = pessoaFisica_idPessoa;
	}
	
	

}
