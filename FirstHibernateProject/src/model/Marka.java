package model;

import javax.persistence.Entity;

@Entity
public class Marka {
   
	private int idMarke;
	private String nazivMarke;
	private String Zemlja;
	
	public int getIdMarke() {
		return idMarke;
	}
	public void setIdMarke(int idMarke) {
		this.idMarke = idMarke;
	}
	public String getNazivMarke() {
		return nazivMarke;
	}
	public void setNazivMarke(String nazivMarke) {
		this.nazivMarke = nazivMarke;
	}
	public String getZemlja() {
		return Zemlja;
	}
	public void setZemlja(String zemlja) {
		Zemlja = zemlja;
	}
	
	
	
	
}
