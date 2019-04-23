package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Moja_tabela")
public class Marka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoinkrement
    @Column(name = "id_marke")
	private int idMarke;
    @Column(name = "Naziv_Marke")
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
