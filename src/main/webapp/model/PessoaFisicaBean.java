package main.webapp.model;

import javax.faces.bean.ManagedBean;

import main.webapp.model.PessoaFisica;

@ManagedBean
public class PessoaFisicaBean {

	private PessoaFisica pessoafisica = new PessoaFisica();

	public PessoaFisica getPessoafisica() {
		return pessoafisica;
	}

	public void setPessoafisica(PessoaFisica pessoafisica) {
		this.pessoafisica = pessoafisica;
	}

}
