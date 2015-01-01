package main.webapp.model;

import javax.faces.bean.ManagedBean;

import main.webapp.model.Pedido;

@ManagedBean
public class PedidoBean {

	private Pedido pedido = new Pedido();

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
