package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdUser;
	private String Ime;
	private String Prezime;
	@ElementCollection
	private List<Adresa> listaAdresa = new ArrayList<Adresa>();

	public int getIdUser() {
		return IdUser;
	}

	public void setIdUser(int idUser) {
		IdUser = idUser;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public List<Adresa> getListaAdresa() {
		return listaAdresa;
	}

	public void setListaAdresa(List<Adresa> listaAdresa) {
		this.listaAdresa = listaAdresa;
	}
	
	
	
}
