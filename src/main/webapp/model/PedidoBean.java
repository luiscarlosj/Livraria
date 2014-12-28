package main.webapp.model;
import javax.faces.bean.ManagedBean;

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
