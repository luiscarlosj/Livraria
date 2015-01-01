package main.webapp.model;

import javax.faces.bean.ManagedBean;

import main.webapp.model.Livro;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public void salva() {
		System.out.println("Descrição: " + livro.getDescricao());
	}

}
