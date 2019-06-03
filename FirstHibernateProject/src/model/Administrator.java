package model;

import javax.persistence.Entity;

@Entity
public class Administrator extends User {
	
	
	
	public String BanujOperatera;
	
	
	

	public String getBanujOperatera() {
		return BanujOperatera;
	}

	public void setBanujOperatera(String banujOperatera) {
		BanujOperatera = banujOperatera;
	}
	
	
	
	

}
