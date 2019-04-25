package buisnessService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Marka;

public class CrudMetode {

	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	
	
	public void ubaciMarku(String nazivMarke,String Zemlja) {

		Marka marka = new Marka();
		marka.setNazivMarke(nazivMarke);
		marka.setZemlja(Zemlja);
		
		Session sesija = sf.openSession();
		sesija.beginTransaction();
		try {
			sesija.save(marka);
			System.out.println("Uspesno ste uneli podatak u tabelu");
			
			sesija.getTransaction().commit();
		} catch (Exception e) {
			sesija.getTransaction().rollback();
			System.out.println("Neuspesno !");
		}finally {
			sesija.close();
		}	
	}
	
	
	public Marka vratiMarku(int idMarke) {
		
		Marka marka = null;
		Session sesija= sf.openSession();
		sesija.beginTransaction();
		
		try {
			
			 marka = sesija.get(Marka.class,idMarke);
			sesija.getTransaction().commit();
			return marka;
		} catch (Exception e) {
			sesija.getTransaction().rollback();
			return null;
		}finally {
			
			sesija.close();
		}
	}
	
	
	
	public boolean azurirajZemlju (int idMarke,String Zemlja) {
		
		Marka marka = null;
		marka= vratiMarku(idMarke);
		Session sesija= sf.openSession();
		sesija.beginTransaction();
		
		try {
			
			   if(marka != null) {
				marka.setZemlja(Zemlja);
				sesija.update(marka);
				System.out.println("Update uspeo!");
				sesija.getTransaction().commit();
				return true;
			    }else {
				System.out.println("Nije uspeo update !");
				sesija.getTransaction().commit();
				return false;
			}
		} catch (Exception e) {
			sesija.getTransaction().rollback();
			return false;
		}finally {
			
			sesija.close();
		}
		
	}
	
}
