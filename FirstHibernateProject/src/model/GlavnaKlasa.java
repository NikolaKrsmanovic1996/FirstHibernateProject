package model;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import buisnessService.CrudMetode;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite naziv_marke");
		String naziv_marke = scanner.nextLine();
		System.out.println("Unesite zemlju ");
		String zemlja= scanner.nextLine();
		System.out.println("Unesite grad");
		String grad = scanner.nextLine();
		System.out.println("Unesite ulicu");
		String ulica = scanner.nextLine();
		
		
		
		
		scanner.close();
		
		CrudMetode metode= new CrudMetode();
	     metode.ubaciMarku(naziv_marke, zemlja, grad, ulica);
				
		
		
	}
}
