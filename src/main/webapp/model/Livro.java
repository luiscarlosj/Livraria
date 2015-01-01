package main.webapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import javax.validation.constraints.NotNull;

@Entity
public class Livro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLivro;
	private String nome;
	private String autor;
	private int anoPublicacao;
	private double precoVenda;
	private double precoAluguel;
	private String descricao;
	private int quantVenda;
	private int quantAluguel;
	private int restVenda;
	private int restAluguel;
	private String imagem;
	private int categoria;
	
	/*private int num;
	private int nume;
	
	public String imprime(){
		 this.num = this.nume*2;
		 return "respLivro";
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNume() {
		return nume;
	}

	public void setNume(int nume) {
		this.nume = nume;
	}
	*/
	

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(float precoAluguel) {
		this.precoAluguel = precoAluguel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantVenda() {
		return quantVenda;
	}

	public void setQuantVenda(int quantVenda) {
		this.quantVenda = quantVenda;
	}

	public int getQuantAluguel() {
		return quantAluguel;
	}

	public void setQuantAluguel(int quantAluguel) {
		this.quantAluguel = quantAluguel;
	}

	public int getRestVenda() {
		return restVenda;
	}

	public void setRestVenda(int restVenda) {
		this.restVenda = restVenda;
	}

	public int getRestAluguel() {
		return restAluguel;
	}

	public void setRestAluguel(int restAluguel) {
		this.restAluguel = restAluguel;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	
	


}
