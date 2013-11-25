package nico.poetzl.projectpoetzl.domain;

import java.util.Date;


public class Kunde extends BasisPerson{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int gekAutos;
	private Date kundeseit;
	
	public Kunde(int gekAutos,Date kundeseit){
		
		
		this.gekAutos=gekAutos;
		this.kundeseit=kundeseit;
	}


	public int getGekAutos() {
		return gekAutos;
	}

	public void setGekAutos(int gekAutos) {
		this.gekAutos = gekAutos;
	}

	public Date getKundeseit() {
		return kundeseit;
	}

	public void setKundeseit(Date kundeseit) {
		this.kundeseit = kundeseit;
	}

}

