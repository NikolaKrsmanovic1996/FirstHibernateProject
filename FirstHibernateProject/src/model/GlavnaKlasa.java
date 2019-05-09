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
		metode.ubaciMarku("Moskvich", "SSSR", "Moskva", "Staljinova 11");
		
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
		  
		  
		 metode.UbaciUsera("a", "b", listaAdresa);
				
		
		
		
		
		
		
	}
}
