package model;

import javax.persistence.Entity;

@Entity
public class Operater extends User {

	
	public String pozicija;

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	
	
	
	
	
	
	
	
}
