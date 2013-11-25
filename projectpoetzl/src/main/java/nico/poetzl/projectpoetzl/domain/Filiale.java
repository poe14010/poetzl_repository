package nico.poetzl.projectpoetzl.domain;

import java.util.Date;


public class Filiale extends BasisKlasse{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bezeichnung;
	private String adresse;
	private int umsatz;
	private Date eröffnung;
	
	
	public Filiale(String bezeichnung,String adresse,
			int umsatz,Date eröffnung){
	
		this.bezeichnung=bezeichnung;
		this.adresse=adresse;
		this.umsatz=umsatz;
		this.eröffnung=eröffnung;
		
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	

	public float getUmsatz() {
		return umsatz;
	}

	public void setUmsatz(int umsatz) {
		this.umsatz = umsatz;
	}

	public Date getEröffnung() {
		return eröffnung;
	}

	public void setEröffnung(Date eröffnung) {
		this.eröffnung = eröffnung;
	}

}

