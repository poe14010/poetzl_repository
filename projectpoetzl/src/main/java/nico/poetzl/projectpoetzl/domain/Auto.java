package nico.poetzl.projectpoetzl.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "autos")
public class Auto extends BasisKlasse{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull
	 @Column(name = "marke", nullable = false, length = 255)
	private String marke;
	private int baujahr;
	private int anzahlsitze;
	private int ps;
	private Filiale filiale;
	
	 protected Auto() {
	        // required for JPA
	    }
	 
	public Auto(String marke,int baujahr,int anzahlsitze,int ps,Filiale filiale){
		
		this.marke=marke;
		this.baujahr=baujahr;
		this.anzahlsitze=anzahlsitze;
		this.ps=ps;
		this.filiale=filiale;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	public int getAnzahlsitze() {
		return anzahlsitze;
	}

	public void setAnzahlsitze(int anzahlsitze) {
		this.anzahlsitze = anzahlsitze;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public Filiale getFiliale() {
		return filiale;
	}

	public void setFiliale(Filiale filiale) {
		this.filiale = filiale;
	}
}
