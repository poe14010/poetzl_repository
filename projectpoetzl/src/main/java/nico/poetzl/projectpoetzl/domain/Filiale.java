package nico.poetzl.projectpoetzl.domain;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Filiale extends BasisKlasse{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
    @Column(name = "bezeichnung", nullable = false, length = 255)
   	private String bezeichnung;
	
	private String adresse;
	
	@Size(max = 255)
    @NotNull
    @Column(name = "umsatz", nullable = false, length = 255)
	private int umsatz;
	
	@Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "open_date", nullable = false)
    private Date eröffnung;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "autos")
    private Collection<Auto> autos;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mitarbeiter")
	private Collection<Mitarbeiter> mitarbeiter;
	
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
	
	public Collection<Auto> getAutos() {
        return Collections.unmodifiableCollection(autos);
    }
	
	public Collection<Mitarbeiter> getMitarbeiter() {
        return Collections.unmodifiableCollection(mitarbeiter);
    }

}

