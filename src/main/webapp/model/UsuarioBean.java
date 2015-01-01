package main.webapp.model;

import javax.faces.bean.ManagedBean;

import main.webapp.model.Usuario;

@ManagedBean
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
