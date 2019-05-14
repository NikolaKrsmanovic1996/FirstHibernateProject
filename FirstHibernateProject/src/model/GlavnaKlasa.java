package model;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import buisnessService.CrudMetode;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite naziv_marke");
		String naziv_marke = scanner.nextLine();
		System.out.println("Unesite zemlju ");
		String zemlja= scanner.nextLine();
		System.out.println("Unesite grad");
		String grad = scanner.nextLine();
		System.out.println("Unesite ulicu");
		String ulica = scanner.nextLine();*/
		
		//scanner.close();//
		
		CrudMetode metode= new CrudMetode();
	    // metode.ubaciMarku(naziv_marke, zemlja, grad, ulica);//
		/*metode.ubaciMarku("Moskvich", "SSSR", "Moskva", "Staljinova 11");
		
		 List<Adresa> listaAdresa = new ArrayList<Adresa>();
		 Adresa adresa1 = new Adresa();
		  adresa1.setZemlja("Srbija");
		  adresa1.setGrad("Beograd");
		  adresa1.setUlica("Kneza Mihajla");
		  listaAdresa.add(adresa1);
		  Adresa adresa2 = new Adresa();
		  adresa2.setZemlja("Srbija");
		  adresa2.setGrad("Beograd");
		  adresa2.setUlica("Kneza Mihajla");
		  listaAdresa.add(adresa2);
		 metode.UbaciUsera("a", "b", listaAdresa);*/
				
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		  List<Adresa> listaAdresa = new ArrayList<Adresa>();
		  List<Marka> marke = new ArrayList<Marka>();
		  
		  User user = new User();
		  Marka marka = new Marka();
		  Marka marka2 = new Marka();
		  Adresa adresa = new Adresa();
		  
		  
		  adresa.setZemlja("Srbija");
		  adresa.setGrad("Beograd");
		  adresa.setUlica("Moja ulica");
		  
		  marka.setNazivMarke("Ferrari");
		  marka.setAdresa(adresa);
		  marka.setUser(user);
		  
		  marka2.setNazivMarke("Lambo");
		  marka2.setAdresa(adresa);
		  marka2.setUser(user);
		  
		  
		  user.setIme("Pera");
		  user.setPrezime("Peric");
		  listaAdresa.add(adresa);
		  user.setListaAdresa(listaAdresa);
		  marke.add(marka);
		  marke.add(marka2);
		  user.setMarke(marke);
		  
		   Session sesija = sf.openSession();
		    sesija.beginTransaction();
		    
		    try {
		    	sesija.save(user);
		    	sesija.save(marka);
		    	sesija.save(marka2);
		    	sesija.getTransaction().commit();
		    	
		    }catch (Exception e) {
		    	sesija.getTransaction().rollback();
		    }finally {
		    	sesija.close();
		    }
		   
		   
		
		
		
		
		
	}
}
