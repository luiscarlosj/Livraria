package main.webapp.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class AlugaBean {
	
	private Aluga aluga = new Aluga ();

	public Aluga getAluga() {  //no pdf estava public Strin getAluga()
		return this.aluga;
	}

	public void setAluga(Aluga aluga) {
		this.aluga = aluga;
	}
	
	
	
	
	

}
