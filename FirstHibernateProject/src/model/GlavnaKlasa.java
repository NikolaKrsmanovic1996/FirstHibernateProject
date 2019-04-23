package model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Marka marka = new Marka();
		marka.setNazivMarke("Bmw");
		marka.setZemlja("Nemacka");
		
		
		Session sesija = sf.openSession();
		sesija.beginTransaction();
		try {
			sesija.save(marka);
			System.out.println("Uspesno ste uneli podatak u tabelu");
			
			sesija.getTransaction().commit();
		} catch (Exception e) {
			sesija.getTransaction().rollback();
			System.out.println("Neuspesno !");
		}
		
		sesija.close();
	}
}
