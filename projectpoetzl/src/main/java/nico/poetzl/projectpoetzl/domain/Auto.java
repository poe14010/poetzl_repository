package nico.poetzl.projectpoetzl.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
	
	@Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "baujahr", nullable = false)
    private int baujahr;
	
	@Size(max = 255)
    @NotNull
    @Column(name = "seatscount", nullable = false, length = 255)
	private int anzahlsitze;
	
	@Size(max = 255)
    @NotNull
    @Column(name = "horsepower", nullable = false, length = 255)
	private int ps;
	
	
	
	 protected Auto() {
	        // required for JPA
	    }
	 
	public Auto(String marke,int baujahr,int anzahlsitze,int ps,Filiale filiale){
		
		this.marke=marke;
		this.baujahr=baujahr;
		this.anzahlsitze=anzahlsitze;
		this.ps=ps;
		
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
}
