package main.webapp.model;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {
	
	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	

}
