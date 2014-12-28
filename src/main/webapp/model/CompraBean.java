package main.webapp.model;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CompraBean {
	
	private Compra compra = new Compra ();

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	
	
}
